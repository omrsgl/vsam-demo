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
@RpcPart(name = "F5750hisHistKeyFcn")
public class F5750hisHistKeyFcn {

    @RpcField(length = 4, originalName = "HIST-KEY-FILE-CONTROL-DATE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histKeyFileControlDate;

    @RpcField(length = 3, originalName = "HIST-KEY-FILE-CONTROL-SEQ", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histKeyFileControlSeq;

    @RpcField(length = 2, originalName = "HIST-KEY-FILE-CONTROL-OFF", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histKeyFileControlOff;
    
    @JsonIgnore
    public String getKey() throws Exception {
        return new StringBuilder()
                .append(VsamConvertUtil.convertPackedDecimal(histKeyFileControlDate, 4, 0))
                .append(VsamConvertUtil.convertPackedDecimal(histKeyFileControlSeq, 3, 0))
                .append(VsamConvertUtil.convertPackedDecimal(histKeyFileControlOff, 2, 0))
                .toString();
    }
}

