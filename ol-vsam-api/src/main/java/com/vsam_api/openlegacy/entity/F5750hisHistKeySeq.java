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
@RpcPart(name = "F5750hisHistKeySeq")
public class F5750hisHistKeySeq {

    @RpcField(length = 1, originalName = "HIST-KEY-ENTRY-SEQ", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9, maximumValue = 9, decimalPlaces = 0)
    private Integer histKeyEntrySeq;

    @RpcField(length = 1, originalName = "HIST-KEY-CONTINUATION", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9, maximumValue = 9, decimalPlaces = 0)
    private Integer histKeyContinuation;
    
    @JsonIgnore
    public String getKey() throws Exception {
        return new StringBuilder()
                .append(VsamConvertUtil.convertPackedDecimal(histKeyEntrySeq, 1, 0))
                .append(VsamConvertUtil.convertPackedDecimal(histKeyContinuation, 1, 0))
                .toString();
    }
}

