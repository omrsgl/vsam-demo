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
@RpcPart(name = "F5750040HistDsubProvider")
public class F5750040HistDsubProvider {

    @RpcField(length = 4, originalName = "HIST-DSUB-PROV-PHONE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histDsubProvPhone;

    @RpcField(length = 2, originalName = "HIST-DSUB-PROV-ST", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProvSt;

    @RpcField(originalName = "HIST-DSUB-PROV-LSTNAME", displayName = "HISTDSUBPROVLSTNAME")
    private F5750040HistDsubProvLstname histDsubProvLstname;

    @RpcField(length = 1, originalName = "HIST-DSUB-PROV-F-INIT", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProvFInit;

    @RpcField(length = 2, originalName = "HIST-DSUB-PROV-UNIQUE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histDsubProvUnique;
    
}

