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
@RpcPart(name = "F5750hisHistKeyRec24")
public class F5750hisHistKeyRec24 {

    @RpcField(length = 2, originalName = "HIST-KEY-REC24-RECNBR", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99, maximumValue = 99, decimalPlaces = 0)
    private Integer histKeyRec24Recnbr;
    
    @JsonIgnore
    public String getKey() throws Exception {
        return new StringBuilder()
                .append(VsamConvertUtil.convertPackedDecimal(histKeyRec24Recnbr, 2, 0))
                .toString();
    }
}

