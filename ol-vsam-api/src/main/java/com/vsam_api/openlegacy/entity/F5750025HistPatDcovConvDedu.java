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
@RpcPart(name = "F5750025HistPatDcovConvDedu")
public class F5750025HistPatDcovConvDedu {

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-CONV-DEDA", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovConvDeda;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-CONV-DEDB", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovConvDedb;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-CONV-DEDC", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovConvDedc;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-CONV-DEDD", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovConvDedd;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-CONV-DEDE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovConvDede;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-CONV-DEDO", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovConvDedo;

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-CONV-DEDP", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histPatDcovConvDedp;
    
}

