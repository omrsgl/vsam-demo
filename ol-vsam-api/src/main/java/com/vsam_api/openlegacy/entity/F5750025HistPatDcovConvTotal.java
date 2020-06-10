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
@RpcPart(name = "F5750025HistPatDcovConvTotal")
public class F5750025HistPatDcovConvTotal {

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-CONV-TOT-TYPA", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovConvTotTypa;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-CONV-TOT-TYPB", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovConvTotTypb;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-CONV-TOT-TYPC", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovConvTotTypc;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-CONV-TOT-TYPD", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovConvTotTypd;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-CONV-TOT-TYPE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovConvTotType;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-CONV-TOT-ORTO", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovConvTotOrto;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-CONV-TOT-PERO", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovConvTotPero;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-CONV-TOT-TYPZ", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovConvTotTypz;
    
}

