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
@RpcPart(name = "F5750024Filler4211798355806464")
public class F5750024Filler4211798355806464 {

    @RpcField(length = 1, originalName = "PC-TH-SURFACE", legacyType = MainFrameLegacyTypes.Char.class)
    @RpcList(count = 5)
    private List<String> pcThSurface;
    
}

