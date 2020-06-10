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
@RpcPart(name = "F5750040HistDsubChgPrintSwitches")
public class F5750040HistDsubChgPrintSwitches {

    @RpcField(length = 1, originalName = "HIST-DSUB-PRT-CHARGE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPrtCharge;

    @RpcField(length = 1, originalName = "HIST-DSUB-PRT-CONTRACT", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPrtContract;

    @RpcField(length = 1, originalName = "HIST-DSUB-PRT-COVERED", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPrtCovered;

    @RpcField(length = 1, originalName = "HIST-DSUB-PRT-PERCENT", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPrtPercent;

    @RpcField(length = 1, originalName = "HIST-DSUB-PRT-BENEFIT", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPrtBenefit;
    
}

