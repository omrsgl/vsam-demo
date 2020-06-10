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
@RpcPart(name = "F5750024PcProcDedMaxTypes")
public class F5750024PcProcDedMaxTypes {

    @RpcField(length = 1, originalName = "PC-PROC-DED-TYPE", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcProcDedType;

    @RpcField(length = 1, originalName = "PC-PROC-MAX-TYPE", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcProcMaxType;
    
}

