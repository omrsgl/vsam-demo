package tests.util;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * * @author Omer Segal (Oct 10, 2020)
 */
public class YamlObjectMapper {

    File file;
    ObjectMapper objectMapper;
    Map<String, Object> yamlData;

    public YamlObjectMapper(File yamlFileName) {
        try {
            file = yamlFileName;
            objectMapper = new ObjectMapper(new YAMLFactory());
            yamlData = objectMapper.readValue(yamlFileName, new TypeReference<Map<String, Object>>() {
            });
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Object getValue(Map<String, Object> map, String key) {

        for (Entry<String, Object> entry : map.entrySet()) {
            if (entry.getKey().equals(key))
                return entry.getValue();
        }
        return null;
    }

    private void setValue(Map<String, Object> map, String key, Object value) {

        for (Entry<String, Object> entry : map.entrySet()) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
            }
        }
    }

    public List getList(String property) {
        Map<String, Object> _yamlData = yamlData;
        String[] properties = property.split("\\.");
        for (int i = 0; i < properties.length - 1; i++) {
            _yamlData = (Map<String, Object>) getValue(_yamlData, properties[i]);
        }
        return (List) getValue(_yamlData, properties[properties.length - 1]);
    }

    public void setValue(String property, Object object) {
        Map<String, Object> _yamlData = yamlData;
        String[] properties = property.split("\\.");
        for (int i = 0; i < properties.length - 1; i++) {
            _yamlData = (Map<String, Object>) getValue(_yamlData, properties[i]);
        }
        setValue(_yamlData, properties[properties.length - 1], object);
        try {
            objectMapper.writeValue(file, yamlData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
