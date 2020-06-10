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
@RpcPart(name = "F5750025HistPatDcovRskInitial")
public class F5750025HistPatDcovRskInitial {

    @RpcField(length = 1, originalName = "HIST-PAT-DCOV-RSK-FLAG-ORIG", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovRskFlagOrig;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-RSK-TAX-ID-ORIG", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999999999, maximumValue = 999999999, decimalPlaces = 0)
    private Integer histPatDcovRskTaxIdOrig;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-RSK-DATE-ORIG", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histPatDcovRskDateOrig;

    @RpcField(length = 2, originalName = "HIST-PAT-DCOV-RSK-RISK-ORIG", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histPatDcovRskRiskOrig;

    @RpcField(length = 2, originalName = "HIST-PAT-DCOV-RSK-DSTATE-ORIG", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histPatDcovRskDstateOrig;
    
}

