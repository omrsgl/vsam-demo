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
@RpcPart(name = "F5750025ThmpPatDcovPerioQuadTab")
public class F5750025ThmpPatDcovPerioQuadTab {

    @RpcField(length = 5, originalName = "THMP-PAT-DCOV-PERIO-QUAD-PROC", legacyType = MainFrameLegacyTypes.Char.class)
    private String thmpPatDcovPerioQuadProc;

    @RpcField(length = 3, originalName = "THMP-PAT-DCOV-PERIO-QUAD-UR-DT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer thmpPatDcovPerioQuadUrDt;

    @RpcField(length = 3, originalName = "THMP-PAT-DCOV-PERIO-QUAD-LR-DT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer thmpPatDcovPerioQuadLrDt;

    @RpcField(length = 3, originalName = "THMP-PAT-DCOV-PERIO-QUAD-UL-DT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer thmpPatDcovPerioQuadUlDt;

    @RpcField(length = 3, originalName = "THMP-PAT-DCOV-PERIO-QUAD-LL-DT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer thmpPatDcovPerioQuadLlDt;

    @RpcField(length = 3, originalName = "THMP-PAT-DCOV-PERIO-QUAD-CC-DT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer thmpPatDcovPerioQuadCcDt;
    
}

