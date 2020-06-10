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
@RpcPart(name = "F5750040HistDsubJEobSchedR")
public class F5750040HistDsubJEobSchedR {

    @RpcField(length = 1, originalName = "HIST-DSUB-J-EOB-SCHED-R-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubJEobSchedRInd;

    @RpcField(length = 3, originalName = "HIST-DSUB-J-FIRST-AMT-CLM", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubJFirstAmtClm;

    @RpcField(length = 3, originalName = "HIST-DSUB-J-SECOND-AMT-CLM", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubJSecondAmtClm;

    @RpcField(length = 3, originalName = "HIST-DSUB-J-THIRD-AMT-CLM", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubJThirdAmtClm;

    @RpcField(length = 3, originalName = "HIST-DSUB-J-FIRST-AMT-PER", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubJFirstAmtPer;

    @RpcField(length = 3, originalName = "HIST-DSUB-J-SECOND-AMT-PER", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubJSecondAmtPer;

    @RpcField(length = 3, originalName = "HIST-DSUB-J-THIRD-AMT-PER", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubJThirdAmtPer;
    
}

