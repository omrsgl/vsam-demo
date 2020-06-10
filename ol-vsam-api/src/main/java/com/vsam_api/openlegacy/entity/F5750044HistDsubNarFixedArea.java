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
@RpcPart(name = "F5750044HistDsubNarFixedArea")
public class F5750044HistDsubNarFixedArea {

    @RpcField(length = 15, originalName = "HIST-DSUB-NAR-PARS", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNarPars;

    @RpcField(length = 5, originalName = "HIST-DSUB-NAR-FILLER", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNarFiller;

    @RpcField(length = 2, originalName = "HIST-DSUB-NAR-SEG-COUNT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histDsubNarSegCount;
    
}

