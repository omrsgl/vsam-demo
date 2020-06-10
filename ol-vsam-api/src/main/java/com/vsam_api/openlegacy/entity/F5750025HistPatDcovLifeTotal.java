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
@RpcPart(name = "F5750025HistPatDcovLifeTotal")
public class F5750025HistPatDcovLifeTotal {

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-LIFE-TOT-TYPA", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovLifeTotTypa;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-LIFE-TOT-TYPB", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovLifeTotTypb;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-LIFE-TOT-TYPC", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovLifeTotTypc;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-LIFE-TOT-TYPD", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovLifeTotTypd;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-LIFE-TOT-TYPE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovLifeTotType;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-LIFE-TOT-ORTO", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovLifeTotOrto;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-LIFE-TOT-PERO", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovLifeTotPero;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-LIFE-TOT-TYPZ", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histPatDcovLifeTotTypz;
    
}

