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
@RpcPart(name = "F5750040HistDsubProvLstname")
public class F5750040HistDsubProvLstname {

    @RpcField(length = 1, originalName = "HIST-DSUB-PROV-LSTINIT", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProvLstinit;

    @RpcField(length = 4, originalName = "HIST-DSUB-PROV-LSTREST", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProvLstrest;
    
}

