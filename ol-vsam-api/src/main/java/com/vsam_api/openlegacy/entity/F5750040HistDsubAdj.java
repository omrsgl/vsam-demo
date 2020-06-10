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
@RpcPart(name = "F5750040HistDsubAdj")
public class F5750040HistDsubAdj {

    @RpcField(length = 3, originalName = "HIST-DSUB-ADJUSTMENT-CLERK", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubAdjustmentClerk;

    @RpcField(length = 3, originalName = "HIST-DSUB-ADJUSTMENT-DATE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubAdjustmentDate;
    
}

