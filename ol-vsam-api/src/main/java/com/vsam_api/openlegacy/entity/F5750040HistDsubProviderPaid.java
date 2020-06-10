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
@RpcPart(name = "F5750040HistDsubProviderPaid")
public class F5750040HistDsubProviderPaid {

    @RpcField(length = 4, originalName = "HIST-DSUB-PMT-PROV-PHONE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histDsubPmtProvPhone;

    @RpcField(length = 2, originalName = "HIST-DSUB-PMT-PROV-ST", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPmtProvSt;

    @RpcField(length = 5, originalName = "HIST-DSUB-PMT-PROV-LSTNAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPmtProvLstname;

    @RpcField(length = 1, originalName = "HIST-DSUB-PMT-F-INIT", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPmtFInit;

    @RpcField(length = 2, originalName = "HIST-DSUB-PMT-PROV-UNIQUE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histDsubPmtProvUnique;
    
}

