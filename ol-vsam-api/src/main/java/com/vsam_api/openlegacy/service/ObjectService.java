package com.vsam_api.openlegacy.service;

import com.vsam_api.openlegacy.model.*;

import java.util.List;

/**
 * @author Tom Fingerman 17/02/2020.
 */
public interface ObjectService {
    VsamObjectsResponse objects();

    VsamObjectDescribeResponse objectDescription(String objectName);

    CountResponse count();

    RecordsResponse records(String objectName,
                            String key,
                            Integer count,
                            Integer retries);

    RecordsResponseByID recordById(String objectName,
                                   String recordId);

    SearchRecordsResponse search(
    						     Integer maxScanCount,
    							 String objectName,
                                 String key,
                                 List<SearchRecordCriteria> searchRecordCriteria,
                                 Integer retries);
}
