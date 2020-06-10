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
@RpcPart(name = "F5750040HistDsubOrthCobThisClm")
public class F5750040HistDsubOrthCobThisClm {

    @RpcField(length = 5, originalName = "HIST-DSUB-ORTH-ALLOW-EXP-CURR", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubOrthAllowExpCurr;

    @RpcField(length = 5, originalName = "HIST-DSUB-ORTH-OI-AMT-CURR", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubOrthOiAmtCurr;

    @RpcField(length = 5, originalName = "HIST-DSUB-ORTH-NET-EXP-CURR", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubOrthNetExpCurr;

    @RpcField(length = 5, originalName = "HIST-DSUB-ORTH-REG-BEN-CURR", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubOrthRegBenCurr;

    @RpcField(length = 5, originalName = "HIST-DSUB-ORTH-BEN-PAYABLE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubOrthBenPayable;

    @RpcField(length = 5, originalName = "HIST-DSUB-ORTH-PRIOR-PAY", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubOrthPriorPay;

    @RpcField(length = 5, originalName = "HIST-DSUB-ORTH-BEN-NOW-DUE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubOrthBenNowDue;
    
}

