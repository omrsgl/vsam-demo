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
@RpcPart(name = "F5750044HistDsubNarPars")
public class F5750044HistDsubNarPars {

    @RpcField(length = 2, originalName = "HIST-DSUB-NAR-PAR1", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNarPar1;

    @RpcField(length = 1, originalName = "HIST-DSUB-NAR-REF1", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNarRef1;

    @RpcField(length = 2, originalName = "HIST-DSUB-NAR-PAR2", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNarPar2;

    @RpcField(length = 1, originalName = "HIST-DSUB-NAR-REF2", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNarRef2;

    @RpcField(length = 2, originalName = "HIST-DSUB-NAR-PAR3", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNarPar3;

    @RpcField(length = 1, originalName = "HIST-DSUB-NAR-REF3", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNarRef3;

    @RpcField(length = 2, originalName = "HIST-DSUB-NAR-PAR4", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNarPar4;

    @RpcField(length = 1, originalName = "HIST-DSUB-NAR-REF4", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNarRef4;

    @RpcField(length = 2, originalName = "HIST-DSUB-NAR-PAR5", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNarPar5;

    @RpcField(length = 1, originalName = "HIST-DSUB-NAR-REF5", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNarRef5;
    
}

