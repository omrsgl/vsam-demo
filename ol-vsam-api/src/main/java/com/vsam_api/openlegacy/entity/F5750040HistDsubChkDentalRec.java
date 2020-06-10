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
@RpcPart(name = "F5750040HistDsubChkDentalRec")
public class F5750040HistDsubChkDentalRec {

    @RpcField(originalName = "HIST-DSUB-CHK-PAYMENT-INFO", displayName = "HISTDSUBCHKPAYMENTINFO")
    @RpcList(count = 4)
    private List<F5750040HistDsubChkPaymentInfo> histDsubChkPaymentInfo;

    @RpcField(length = 4, originalName = "HIST-DSUB-PAT-RESP-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubPatRespAmt;
    
}

