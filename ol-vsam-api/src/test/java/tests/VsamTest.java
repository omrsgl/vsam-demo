package tests;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.vsam_api.openlegacy.model.Record;
import com.vsam_api.openlegacy.model.RecordsResponseByID;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.vsam_api.openlegacy.model.RecordsResponse;
import com.vsam_api.openlegacy.service.ObjectService;

import tests.util.YamlObjectMapper;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles(profiles = "common-test")
public class VsamTest {

    private final Integer DEFAULT_COUNT = 2;
    private final String LINE = "----------------------------------------------------";
    int counterTotalResults = 0;
    int counterTotalRecordsNotIdentifiedResults = 0;

    private final ObjectService objectService;

    @Autowired
    public VsamTest(ObjectService objectService) {
        this.objectService = objectService;
    }

    @Test
    public void testScanVsamFileList() {
        List<String> vsamFileList = Arrays.asList("AAVSAMML", "AAESDSML", "AAVS51ML");
        //List<String> vsamFileList = Arrays.asList("AAESDSML");
        for(String objectName : vsamFileList) {
           scanVsamFile(objectName, null);
        }
    }

    //@Test
    public void testScanVsamFileFromKey() {
        String startFromKey = "0008052CF0F6F4F4F4F8F8F4F04040F1001CC47939880C77388C019C8C9C040C";
        String objectName = "AAVS51ML";
        scanVsamFile(objectName, startFromKey);
    }

    //@Test
    public void testScanAllVsamFiles() throws URISyntaxException {
        List<String> vsamFileList = getVsamFileList();
        for(String objectName : vsamFileList) {
            scanVsamFile(objectName, null);
        }
    }

    //@Test
    public void testRecords() {
        String objectName = "AAVS51ML";
        System.out.println(LINE + "\nStarted records test for VSAM file - '" + objectName + "'\n" + LINE);
        List<String> keys = Arrays.asList(
            "0008052CF0F6F4F4F4F8F8F4F04040F1001CC47939880C77388C019C8C9C040C",
            "0008052CF0F5F3F8F0F2F3F5F54040F2001CC47819089C02121C019C9C9C040C",
            "0008052CF0F0F7F6F0F9F6F6F64040F0001CC47839177C61723C019C9C9C040C",
            "0008052CF0F0F1F0F2F3F8F9F44040F2002CC47819469C01088C019C8C4C040C",
            "0008052CF0F0F2F5F0F4F9F9F44040F1001CC47819078C65074C019C9C9C040C",
            "0008052CF0F0F2F5F4F7F2F6F34040F0001CC47838791C91024C019C8C9C040C",
            "0008052CF0F0F7F7F0F5F6F0F94040F2001CC47829177C63452C019C7C9C040C",
            "0008052CF0F0F1F0F2F3F8F9F44040F0001CC47819680C97418C019C9C9C040C");
        for(String key : keys) {
            System.out.println("Key = " + key);
            try {
                RecordsResponseByID recordsResponseByID = objectService.recordById(objectName, key);
                Assert.assertEquals(recordsResponseByID.getStatus(), "success");
            } catch(Exception e){
                System.out.println(LINE + "\nERROR - for key: " + key + "\n" + LINE);
                e.printStackTrace();
                Assert.assertNull(e);
            }
        }
        System.out.println(LINE + "\nEnded records test successfully for VSAM file - '" + objectName + "'\n" + LINE);
    }


    private Boolean scanVsamFile(String objectName, String startFromKey) {
        System.out.println(LINE + "\nStarted VSAM file scan - '" + objectName + "' (count=" + DEFAULT_COUNT +  ")\n" + LINE);
        String paginationKey = startFromKey == null ? null : startFromKey.substring(startFromKey.length() - 8);
        do {
            System.out.println("Key = " + (paginationKey == null ? "{FIRST-KEY}" : paginationKey));
            try {
                RecordsResponse recordsResponse = objectService.records(objectName, paginationKey, DEFAULT_COUNT, null);
                countersInc(recordsResponse);
                paginationKey = recordsResponse.getPaginationKey();
            } catch(Exception e){
                System.out.println(LINE + "\nERROR - Couldn't complete scan for file " + objectName + "\n" + getFinishVsamFileScanMsgSuffix() + LINE);
                //e.printStackTrace();
                return false;
            }
        } while(paginationKey != null);
        Assert.assertNull(paginationKey);
        System.out.println(LINE + "\nEnded VSAM file scan successfully - '" + objectName + "'\n" + getFinishVsamFileScanMsgSuffix() + LINE);
        initCounters();
        return true;
    }

    private void countersInc(RecordsResponse recordsResponse) {
        int currentCounterResults = 0;
        int currentCounterRecordsNotIdentifiedResults = 0;
        for(Record record : recordsResponse.getRecords()) {
            currentCounterResults++;
            if(record.getData().size() == 1 && record.getData().get(0).getFieldName().equals("root"))
                currentCounterRecordsNotIdentifiedResults++;
        }
        this.counterTotalResults += currentCounterResults;
        this.counterTotalRecordsNotIdentifiedResults += currentCounterRecordsNotIdentifiedResults;
        System.out.print(String.format("currentResults = %s , currentRecordsNotIdentifiedResults = %s , " + getFinishVsamFileScanMsgSuffix(), currentCounterResults, currentCounterRecordsNotIdentifiedResults));
    }

    private List<String> getVsamFileList() throws URISyntaxException {
        List<String> vsamFileList = new ArrayList<String>();
        URL res = getClass().getClassLoader().getResource("application-common-test.yml");
        File applicationYml = Paths.get(res.toURI()).toFile();
        YamlObjectMapper yamlObjectMapper = new YamlObjectMapper(applicationYml);
        List<Map<String, Object>> vsamFiles = yamlObjectMapper.getList("ol.vsam.files");
        for (Map<String, Object> entry : vsamFiles) {
            vsamFileList.add((String) entry.get("name"));
        }
        return vsamFileList;
    }

    private String getFinishVsamFileScanMsgSuffix() {
        return String.format("totalResults = %s , totalRecordsNotIdentifiedResults = %s\n", counterTotalResults, counterTotalRecordsNotIdentifiedResults);
    }

    private void initCounters(){
        counterTotalResults = 0;
        counterTotalRecordsNotIdentifiedResults = 0;
    }
}
