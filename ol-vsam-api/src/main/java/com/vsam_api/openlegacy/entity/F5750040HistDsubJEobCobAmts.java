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
@RpcPart(name = "F5750040HistDsubJEobCobAmts")
public class F5750040HistDsubJEobCobAmts {

    @RpcField(originalName = "HIST-DSUB-J-COB-AMT-PREV-CLM", displayName = "HISTDSUBJCOBAMTPREVCLM")
    private F5750040HistDsubJCobAmtPrevClm histDsubJCobAmtPrevClm;

    @RpcField(originalName = "HIST-DSUB-J-COB-THIS-CLAIM", displayName = "HISTDSUBJCOBTHISCLAIM")
    private F5750040HistDsubJCobThisClaim histDsubJCobThisClaim;
    
}

