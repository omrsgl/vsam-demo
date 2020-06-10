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
@RpcPart(name = "F5750040HistDsubJCobAmtPrevClm")
public class F5750040HistDsubJCobAmtPrevClm {

    @RpcField(length = 5, originalName = "HIST-DSUB-J-ALLOW-EXP-PREV", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubJAllowExpPrev;

    @RpcField(length = 5, originalName = "HIST-DSUB-J-OI-AMT-PREV", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubJOiAmtPrev;

    @RpcField(length = 5, originalName = "HIST-DSUB-J-NET-EXPENSE-PREV", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubJNetExpensePrev;

    @RpcField(length = 5, originalName = "HIST-DSUB-J-REG-BENEFIT-PREV", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubJRegBenefitPrev;
    
}

