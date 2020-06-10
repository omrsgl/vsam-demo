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
@RpcPart(name = "F5750044Filler9429138795312847")
public class F5750044Filler9429138795312847 {

    @RpcField(length = 2, originalName = "HIST-DSUB-NAR-TBL-PAR", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNarTblPar;

    @RpcField(length = 1, originalName = "HIST-DSUB-NAR-TBL-REF", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNarTblRef;
    
}

