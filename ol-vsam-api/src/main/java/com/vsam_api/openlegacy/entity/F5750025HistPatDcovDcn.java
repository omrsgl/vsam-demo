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
@RpcPart(name = "F5750025HistPatDcovDcn")
public class F5750025HistPatDcovDcn {

    @RpcField(length = 4, originalName = "HIST-PAT-DCOV-DCN-DT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999999, maximumValue = 999999, decimalPlaces = 0)
    private Integer histPatDcovDcnDt;

    @RpcField(length = 6, originalName = "HIST-PAT-DCOV-DCN-SEQ", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovDcnSeq;
    
}

