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
@RpcPart(name = "F5750025HistPatDcovRskEvals")
public class F5750025HistPatDcovRskEvals {

    @RpcField(length = 36, originalName = "HIST-PAT-DCOV-RSK-EVAL-ORIG", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovRskEvalOrig;

    @RpcField(length = 36, originalName = "HIST-PAT-DCOV-RSK-EVAL-PREV", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovRskEvalPrev;

    @RpcField(length = 36, originalName = "HIST-PAT-DCOV-RSK-EVAL-CURR", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovRskEvalCurr;
    
}

