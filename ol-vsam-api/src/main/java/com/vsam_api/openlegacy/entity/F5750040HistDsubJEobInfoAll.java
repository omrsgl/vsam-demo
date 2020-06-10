package com.vsam_api.openlegacy.entity;


import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vsam_api.openlegacy.util.VsamConvertUtil;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RpcPart(name = "F5750040HistDsubJEobInfoAll")
public class F5750040HistDsubJEobInfoAll {

    @RpcField(originalName = "HIST-DSUB-J-EOB-DED-MAX-DATA", displayName = "HISTDSUBJEOBDEDMAXDATA")
    private F5750040HistDsubJEobDedMaxData histDsubJEobDedMaxData;

    @RpcField(originalName = "HIST-DSUB-J-EOB-COB-AMTS", displayName = "HISTDSUBJEOBCOBAMTS")
    private F5750040HistDsubJEobCobAmts histDsubJEobCobAmts;

    @RpcField(originalName = "HIST-DSUB-J-EOB-SCHED-R", displayName = "HISTDSUBJEOBSCHEDR")
    private F5750040HistDsubJEobSchedR histDsubJEobSchedR;
    
}

