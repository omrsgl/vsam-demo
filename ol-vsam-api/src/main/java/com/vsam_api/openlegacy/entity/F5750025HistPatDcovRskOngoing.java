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
@RpcPart(name = "F5750025HistPatDcovRskOngoing")
public class F5750025HistPatDcovRskOngoing {

    @RpcField(length = 1, originalName = "HIST-PAT-DCOV-RSK-FLAG-ONGO", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovRskFlagOngo;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-RSK-TAX-ID-ONGO", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999999999, maximumValue = 999999999, decimalPlaces = 0)
    private Integer histPatDcovRskTaxIdOngo;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-RSK-DATE-ONGO", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histPatDcovRskDateOngo;

    @RpcField(length = 2, originalName = "HIST-PAT-DCOV-RSK-RISK-ONGO", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histPatDcovRskRiskOngo;

    @RpcField(length = 2, originalName = "HIST-PAT-DCOV-RSK-DSTATE-ONGO", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histPatDcovRskDstateOngo;
    
}

