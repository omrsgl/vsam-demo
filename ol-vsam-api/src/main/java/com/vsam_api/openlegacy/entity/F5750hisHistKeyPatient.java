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
@RpcPart(name = "F5750hisHistKeyPatient")
public class F5750hisHistKeyPatient {

    @RpcField(length = 1, originalName = "HIST-KEY-RELATION", legacyType = MainFrameLegacyTypes.Char.class)
    private String histKeyRelation;

    @RpcField(length = 2, originalName = "HIST-KEY-SEQUENCE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histKeySequence;
    
    @JsonIgnore
    public String getKey() throws Exception {
        return new StringBuilder()
                .append(VsamConvertUtil.convertChar(histKeyRelation, 1))
                .append(VsamConvertUtil.convertPackedDecimal(histKeySequence, 2, 0))
                .toString();
    }
}

