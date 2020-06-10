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
@RpcPart(name = "F5750040HistDsubJCobThisClaim")
public class F5750040HistDsubJCobThisClaim {

    @RpcField(length = 5, originalName = "HIST-DSUB-J-ALLOW-EXP-CURR", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubJAllowExpCurr;

    @RpcField(length = 5, originalName = "HIST-DSUB-J-OI-AMT-CURR", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubJOiAmtCurr;

    @RpcField(length = 5, originalName = "HIST-DSUB-J-NET-EXPENSE-CURR", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubJNetExpenseCurr;

    @RpcField(length = 5, originalName = "HIST-DSUB-J-REG-BENEFIT-CURR", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubJRegBenefitCurr;

    @RpcField(length = 5, originalName = "HIST-DSUB-J-BENEFIT-PAYABLE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubJBenefitPayable;

    @RpcField(length = 5, originalName = "HIST-DSUB-J-PRIOR-PAYMENT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubJPriorPayment;

    @RpcField(length = 5, originalName = "HIST-DSUB-J-BENEFIT-NOW-DUE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubJBenefitNowDue;
    
}

