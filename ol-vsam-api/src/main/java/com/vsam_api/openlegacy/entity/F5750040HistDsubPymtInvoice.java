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
@RpcPart(name = "F5750040HistDsubPymtInvoice")
public class F5750040HistDsubPymtInvoice {

    @RpcField(length = 4, originalName = "HIST-DSUB-TOT-FEE-DIFF", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubTotFeeDiff;

    @RpcField(length = 4, originalName = "HIST-DSUB-TOT-COST-SHARE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubTotCostShare;

    @RpcField(length = 4, originalName = "HIST-DSUB-TOT-MAX-EXCEED", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubTotMaxExceed;

    @RpcField(length = 4, originalName = "HIST-DSUB-RET-FEE-DIFF", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubRetFeeDiff;

    @RpcField(length = 4, originalName = "HIST-DSUB-RET-COST-SHARE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubRetCostShare;

    @RpcField(length = 4, originalName = "HIST-DSUB-RET-MAX-EXCEED", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubRetMaxExceed;

    @RpcField(originalName = "HIST-DSUB-TRI-PAYEE-NAME", displayName = "HISTDSUBTRIPAYEENAME")
    private F5750040HistDsubTriPayeeName histDsubTriPayeeName;
    
}

