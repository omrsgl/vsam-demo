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
@RpcPart(name = "F5750040HistDsubJOrthMaxTypes")
public class F5750040HistDsubJOrthMaxTypes {

    @RpcField(length = 3, originalName = "HIST-DSUB-J-ORTH-MAX-EXP-DT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubJOrthMaxExpDt;

    @RpcField(length = 1, originalName = "HIST-DSUB-J-ORTH-MAX-TYPE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubJOrthMaxType;

    @RpcField(length = 5, originalName = "HIST-DSUB-J-ORTH-MAX-USED-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubJOrthMaxUsedAmt;

    @RpcField(length = 5, originalName = "HIST-DSUB-J-ORTH-MAX-PLAN-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubJOrthMaxPlanAmt;

    @RpcField(length = 1, originalName = "HIST-DSUB-J-ORTH-MAX-TYPE-AMT", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubJOrthMaxTypeAmt;
    
}

