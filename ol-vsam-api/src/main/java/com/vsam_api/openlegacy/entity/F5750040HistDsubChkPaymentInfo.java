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
@RpcPart(name = "F5750040HistDsubChkPaymentInfo")
public class F5750040HistDsubChkPaymentInfo {

    @RpcField(length = 9, originalName = "HIST-DSUB-CHK-CHECK-NUMBER", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubChkCheckNumber;

    @RpcField(length = 4, originalName = "HIST-DSUB-CHK-BLOCK-NUMBER", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubChkBlockNumber;

    @RpcField(length = 1, originalName = "HIST-DSUB-CHK-PAYEE-INDICATOR", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubChkPayeeIndicator;
    
}

