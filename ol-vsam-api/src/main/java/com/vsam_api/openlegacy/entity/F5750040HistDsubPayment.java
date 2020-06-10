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
@RpcPart(name = "F5750040HistDsubPayment")
public class F5750040HistDsubPayment {

    @RpcField(length = 3, originalName = "HIST-DSUB-DATE-PAID", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubDatePaid;

    @RpcField(originalName = "HIST-DSUB-PROVIDER-PAID", displayName = "HISTDSUBPROVIDERPAID")
    private F5750040HistDsubProviderPaid histDsubProviderPaid;

    @RpcField(length = 4, originalName = "HIST-DSUB-AMT-PD", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubAmtPd;

    @RpcField(length = 1, originalName = "HIST-DSUB-HISTORY-UPDATE-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubHistoryUpdateInd;

    @RpcField(length = 3, originalName = "HIST-DSUB-DT-RETURN", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubDtReturn;

    @RpcField(length = 4, originalName = "HIST-DSUB-AMT-RETURN", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubAmtReturn;

    @RpcField(length = 4, originalName = "HIST-DSUB-PYMT-FC-DATE", legacyType = MainFrameLegacyTypes.PackedDecimalPositive.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histDsubPymtFcDate;

    @RpcField(length = 3, originalName = "HIST-DSUB-PYMT-FC-SEQ", legacyType = MainFrameLegacyTypes.PackedDecimalPositive.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubPymtFcSeq;

    @RpcField(length = 2, originalName = "HIST-DSUB-PYMT-FC-OFF", legacyType = MainFrameLegacyTypes.PackedDecimalPositive.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 999, decimalPlaces = 0)
    private Integer histDsubPymtFcOff;

    @RpcField(length = 1, originalName = "HIST-DSUB-SQUEEZE-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubSqueezeInd;

    @RpcField(length = 4, originalName = "HIST-DSUB-BULK-PAY-DATE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histDsubBulkPayDate;

    @RpcField(length = 1, originalName = "HIST-DSUB-MAIL-CODE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubMailCode;

    @RpcField(length = 2, originalName = "HIST-DSUB-PYMT-FC-ENTRY", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPymtFcEntry;

    @RpcField(originalName = "HIST-DSUB-PYMT-INVOICE", displayName = "HISTDSUBPYMTINVOICE")
    private F5750040HistDsubPymtInvoice histDsubPymtInvoice;

    @Hidden
    @RpcField(length = 56, originalName = "filler_1369206493841465", legacyType = MainFrameLegacyTypes.Char.class)
    private String filler1369206493841465;

    @RpcField(length = 6, originalName = "HIST-DSUB-FILLER-PAYMENT1", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubFillerPayment1;

    @RpcField(length = 15, originalName = "HIST-DSUB-FILLER-PAYMENT", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubFillerPayment;
    
}

