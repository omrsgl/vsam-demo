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
@RpcPart(name = "F5750025HistPatDcovSegmentAll")
public class F5750025HistPatDcovSegmentAll {

    @RpcField(length = 2, originalName = "HIST-PAT-DCOV-QUAD", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovQuad;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-PROC", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovProc;

    @RpcField(length = 3, originalName = "HIST-PAT-DCOV-CON", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovCon;

    @RpcField(length = 5, originalName = "HIST-PAT-DCOV-AUTH-DATE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999999, maximumValue = 99999999, decimalPlaces = 0)
    private Integer histPatDcovAuthDate;

    @RpcField(originalName = "HIST-PAT-DCOV-DCN", displayName = "HISTPATDCOVDCN")
    private F5750025HistPatDcovDcn histPatDcovDcn;

    @RpcField(originalName = "HIST-PAT-DCOV-FCN", displayName = "HISTPATDCOVFCN")
    private F5750025HistPatDcovFcn histPatDcovFcn;

    @RpcField(length = 8, originalName = "HIST-PAT-DCOV-DELETED", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovDeleted;
    
}

