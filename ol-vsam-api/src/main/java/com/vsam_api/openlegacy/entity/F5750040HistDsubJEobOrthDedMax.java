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
@RpcPart(name = "F5750040HistDsubJEobOrthDedMax")
public class F5750040HistDsubJEobOrthDedMax {

    @RpcField(length = 2, originalName = "HIST-DSUB-J-ORTH-DED-TBL-ENTR", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histDsubJOrthDedTblEntr;

    @RpcField(originalName = "HIST-DSUB-J-ORTH-DED-TYPES", displayName = "HISTDSUBJORTHDEDTYPES")
    @RpcList(count = 5)
    private List<F5750040HistDsubJOrthDedTypes> histDsubJOrthDedTypes;

    @RpcField(length = 2, originalName = "HIST-DSUB-J-ORTH-MAX-TBL-ENTR", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histDsubJOrthMaxTblEntr;

    @RpcField(originalName = "HIST-DSUB-J-ORTH-MAX-TYPES", displayName = "HISTDSUBJORTHMAXTYPES")
    @RpcList(count = 5)
    private List<F5750040HistDsubJOrthMaxTypes> histDsubJOrthMaxTypes;

    @RpcField(originalName = "HIST-DSUB-ORTH-EOB-COB-AMTS", displayName = "HISTDSUBORTHEOBCOBAMTS")
    @RpcList(count = 2)
    private List<F5750040HistDsubOrthEobCobAmts> histDsubOrthEobCobAmts;
    
}

