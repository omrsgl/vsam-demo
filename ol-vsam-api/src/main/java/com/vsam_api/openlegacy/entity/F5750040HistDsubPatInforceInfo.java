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
@RpcPart(name = "F5750040HistDsubPatInforceInfo")
public class F5750040HistDsubPatInforceInfo {

    @RpcField(length = 3, originalName = "HIST-DSUB-PAT-BIRTH-DT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubPatBirthDt;

    @RpcField(length = 12, originalName = "HIST-DSUB-PAT-FIRST-NM", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPatFirstNm;

    @RpcField(length = 1, originalName = "HIST-DSUB-PAT-SEX", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPatSex;

    @RpcField(length = 1, originalName = "HIST-DSUB-PAT-CHILD-OTH-MOD", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPatChildOthMod;
    
}

