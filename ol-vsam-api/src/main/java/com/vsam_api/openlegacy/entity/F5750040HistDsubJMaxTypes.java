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
@RpcPart(name = "F5750040HistDsubJMaxTypes")
public class F5750040HistDsubJMaxTypes {

    @RpcField(length = 1, originalName = "HIST-DSUB-J-MAX-TYPE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubJMaxType;

    @RpcField(length = 5, originalName = "HIST-DSUB-J-MAX-USED-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubJMaxUsedAmt;

    @RpcField(length = 5, originalName = "HIST-DSUB-J-MAX-PLAN-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubJMaxPlanAmt;

    @RpcField(length = 1, originalName = "HIST-DSUB-J-MAX-TYPE-OF-AMT", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubJMaxTypeOfAmt;
    
}

