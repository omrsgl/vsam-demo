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
@RpcPart(name = "F5750040HistDsubThdPrty")
public class F5750040HistDsubThdPrty {

    @RpcField(length = 1, originalName = "HIST-DSUB-THDPRTY-SEQ", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubThdprtySeq;

    @RpcField(length = 32, originalName = "HIST-DSUB-THDPRTY-NMADRS", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubThdprtyNmadrs;

    @RpcField(length = 146, originalName = "HIST-DSUB-FILLER-TPRTY", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubFillerTprty;
    
}

