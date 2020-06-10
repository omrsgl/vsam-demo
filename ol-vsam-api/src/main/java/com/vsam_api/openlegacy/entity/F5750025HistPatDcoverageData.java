package com.vsam_api.openlegacy.entity;


import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vsam_api.openlegacy.util.VsamConvertUtil;
import org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RpcPart(name = "F5750025HistPatDcoverageData")
public class F5750025HistPatDcoverageData {

    @RpcField(originalName = "HIST-PAT-DCOV-DATES", displayName = "HISTPATDCOVDATES")
    @RpcList(count = 5)
    private List<F5750025HistPatDcovDates> histPatDcovDates;

    @RpcField(originalName = "THMP-PAT-DCOV-TOOTH-STAT", displayName = "THMPPATDCOVTOOTHSTAT")
    @RpcList(count = 32)
    private List<F5750025ThmpPatDcovToothStat> thmpPatDcovToothStat;

    @RpcField(length = 40, originalName = "HIST-PAT-DCOV-LIFE-TOTALS-BEN", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovLifeTotalsBen;

    @RpcField(length = 28, originalName = "HIST-PAT-DCOV-LIFE-TOTALS-DED", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovLifeTotalsDed;

    @RpcField(length = 3, originalName = "THMP-PAT-DCOV-PRIOR-DT-UPR", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer thmpPatDcovPriorDtUpr;

    @RpcField(length = 1, originalName = "THMP-PAT-DCOV-TYPE-UPR", legacyType = MainFrameLegacyTypes.Char.class)
    private String thmpPatDcovTypeUpr;

    @RpcField(length = 3, originalName = "THMP-PAT-DCOV-PRIOR-DT-LOWER", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer thmpPatDcovPriorDtLower;

    @RpcField(length = 1, originalName = "THMP-PAT-DCOV-TYPE-LWR", legacyType = MainFrameLegacyTypes.Char.class)
    private String thmpPatDcovTypeLwr;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-COB-SAVINGS-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovCobSavingsAmt;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-COB-SAVE-EXT-MAX", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovCobSaveExtMax;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-NET-CHK-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovNetChkAmt;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-PAY-REDUC", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovPayReduc;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-OP-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovOpAmt;

    @RpcField(length = 1, originalName = "HIST-PAT-DCOV-PURGE-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovPurgeInd;

    @RpcField(length = 3, originalName = "THMP-PAT-DCOV-FULL-MOUTH-XR-DT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer thmpPatDcovFullMouthXrDt;
    
}

