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
@RpcPart(name = "F5750hisHistTimeStmp")
public class F5750hisHistTimeStmp {

    @RpcField(length = 3, originalName = "HIST-OPERATOR-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String histOperatorId;

    @RpcField(length = 4, originalName = "HIST-CRT-CODE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histCrtCode;

    @RpcField(length = 3, originalName = "HIST-DATE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDate;

    @RpcField(length = 4, originalName = "HIST-TIME", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histTime;
    
}

