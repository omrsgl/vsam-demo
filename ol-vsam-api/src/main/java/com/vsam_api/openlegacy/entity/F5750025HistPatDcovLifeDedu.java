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
@RpcPart(name = "F5750025HistPatDcovLifeDedu")
public class F5750025HistPatDcovLifeDedu {

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-LIFE-DEDA", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovLifeDeda;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-LIFE-DEDB", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovLifeDedb;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-LIFE-DEDC", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovLifeDedc;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-LIFE-DEDD", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovLifeDedd;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-LIFE-DEDE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovLifeDede;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-LIFE-DEDO", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovLifeDedo;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-LIFE-DEDP", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovLifeDedp;
    
}

