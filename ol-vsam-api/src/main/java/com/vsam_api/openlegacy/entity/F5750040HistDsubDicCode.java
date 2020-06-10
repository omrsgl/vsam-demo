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
@RpcPart(name = "F5750040HistDsubDicCode")
public class F5750040HistDsubDicCode {

    @RpcField(length = 1, originalName = "HIST-DSUB-DIC-CODE-1", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubDicCode1;

    @RpcField(length = 1, originalName = "HIST-DSUB-DIC-CODE-2", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubDicCode2;
    
}

