package com.vsam_api.openlegacy.controller;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vsam_api.openlegacy.model.CountResponse;
import com.vsam_api.openlegacy.model.RecordsResponse;
import com.vsam_api.openlegacy.model.RecordsResponseByID;
import com.vsam_api.openlegacy.model.SearchRecordCriteria;
import com.vsam_api.openlegacy.model.SearchRecordsResponse;
import com.vsam_api.openlegacy.model.VsamObjectDescribeResponse;
import com.vsam_api.openlegacy.model.VsamObjectsResponse;
import com.vsam_api.openlegacy.service.ObjectService;

import lombok.RequiredArgsConstructor;

/**
 * @author Tom Fingerman 17/02/2020.
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class ObjectController {
    private final ObjectService objectService;
    
	@GetMapping("/objects")
    public VsamObjectsResponse objects() {    	
        return this.objectService.objects();
    }

    @GetMapping("/objects/{object-name}/describe")
    public VsamObjectDescribeResponse objectDescription(
    		@PathVariable(name = "object-name") String objectName
    ) {
        return this.objectService.objectDescription(objectName);
    }

    @GetMapping("/objects/{object-name}/count")
    public CountResponse count(
	        @PathVariable(name = "object-name") String objectName
    ) {
    	
    	return this.objectService.count();
    }
    
    @Validated
    @GetMapping("/objects/{object-name}/records")
    public RecordsResponse records(
        	@PathVariable(name = "object-name") String objectName,
        	@RequestParam(name = "paginationKey", required = false) String paginationKey,
        	@RequestParam(name = "Offset", required = false) Integer offset,
        	@RequestParam(name = "Count", required = false, defaultValue = "32767") @Min(1) @Max(32767) Integer count,
            @RequestParam(name = "retries", required = false) Integer retries
    ) {
    	
        return this.objectService.records(objectName, paginationKey, count, retries);
    }

    @GetMapping("/objects/{object-name}/records/{record-id}")
    public RecordsResponseByID recordById(
    		@PathVariable(name = "object-name") String objectName,
    		@PathVariable(name = "record-id") String recordId
    ) {
    	return this.objectService.recordById(objectName, recordId);
    }

    @PostMapping(value = "/objects/{object-name}/sar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public SearchRecordsResponse search(
        	@RequestParam(name = "Count", required = false) Integer maxScanCount,
    		@PathVariable(name = "object-name") String objectName,
    		@RequestParam(name = "paginationKey", required = false) String paginationKey,
    		@RequestParam(name = "Offset", required = false) Integer offset,
    		@RequestBody List<SearchRecordCriteria> searchRecordCriteria,
            @RequestParam(name = "retries", required = false) Integer retries
    ) {
    	return this.objectService.search(maxScanCount, objectName, paginationKey, searchRecordCriteria, retries);
    }
}
