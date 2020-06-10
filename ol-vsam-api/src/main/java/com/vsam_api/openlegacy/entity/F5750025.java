package com.vsam_api.openlegacy.entity;


import org.openlegacy.providers.vsam.VsamConstants;
import org.openlegacy.core.annotations.common.Attribute;
import org.openlegacy.core.annotations.common.PartAttributes;
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
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RpcPart(name = "F5750025")
@PartAttributes(attributes = {@Attribute(key = VsamConstants.RECORD_TYPE_KEY, value = "025C")})
public class F5750025 extends F5750his {

    @RpcField(length = 1, originalName = "HIST-PAT-DCOV-NUMBER", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9, maximumValue = 9, decimalPlaces = 0)
    private Integer histPatDcovNumber;

    @RpcField(originalName = "HIST-PAT-DCOVERAGE-DATA", displayName = "HISTPATDCOVERAGEDATA")
    private F5750025HistPatDcoverageData histPatDcoverageData;

    @RpcField(length = 1, originalName = "THMP-PAT-DCOV-PRIOR-PERIO-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String thmpPatDcovPriorPerioInd;

    @RpcField(length = 1, originalName = "HIST-PAT-DCOV-FILLER", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovFiller;

    @RpcField(originalName = "THMP-PAT-DCOV-PERIO-FULL-TBL", displayName = "THMPPATDCOVPERIOFULLTBL")
    private F5750025ThmpPatDcovPerioFullTbl thmpPatDcovPerioFullTbl;

    @RpcField(length = 64, originalName = "HIST-PAT-DCOV-PERIO-FULL-FILL", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovPerioFullFill;

    @RpcField(originalName = "THMP-PAT-DCOV-PERIO-QUAD-TBL", displayName = "THMPPATDCOVPERIOQUADTBL")
    private F5750025ThmpPatDcovPerioQuadTbl thmpPatDcovPerioQuadTbl;

    @RpcField(length = 400, originalName = "HIST-PAT-DCOV-PERIO-QUAD-FILL", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovPerioQuadFill;

    @RpcField(originalName = "THMP-PAT-DCOV-PERIO-TOOTH-TBL", displayName = "THMPPATDCOVPERIOTOOTHTBL")
    private F5750025ThmpPatDcovPerioToothTbl thmpPatDcovPerioToothTbl;

    @RpcField(length = 3536, originalName = "HIST-PAT-DCOV-PERIO-TOOT-FILL", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovPerioTootFill;

    @RpcField(length = 40, originalName = "HIST-PAT-DCOV-CONV-TOTALS-BEN", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovConvTotalsBen;

    @RpcField(length = 28, originalName = "HIST-PAT-DCOV-CONV-TOTALS-DED", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovConvTotalsDed;

    @RpcField(length = 3, originalName = "THMP-PAT-DCOV-FULLM-XR-DT-PR", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer thmpPatDcovFullmXrDtPr;

    @RpcField(originalName = "HIST-PAT-DCOV-RSK-GUID-GRP", displayName = "HISTPATDCOVRSKGUIDGRP")
    private F5750025HistPatDcovRskGuidGrp histPatDcovRskGuidGrp;

    @RpcField(originalName = "HIST-PAT-DCOV-RSK-INITIAL", displayName = "HISTPATDCOVRSKINITIAL")
    private F5750025HistPatDcovRskInitial histPatDcovRskInitial;

    @RpcField(originalName = "HIST-PAT-DCOV-RSK-ONGOING", displayName = "HISTPATDCOVRSKONGOING")
    @RpcList(count = 9)
    private List<F5750025HistPatDcovRskOngoing> histPatDcovRskOngoing;

    @RpcField(originalName = "HIST-PAT-DCOV-RSK-EVALS", displayName = "HISTPATDCOVRSKEVALS")
    private F5750025HistPatDcovRskEvals histPatDcovRskEvals;

    @RpcField(originalName = "HIST-PAT-DCOV-PREAUTH-RECS", displayName = "HISTPATDCOVPREAUTHRECS")
    private F5750025HistPatDcovPreauthRecs histPatDcovPreauthRecs;

    @RpcField(originalName = "HIST-PAT-DCOV-CONSULT-MSG-TBL", displayName = "HISTPATDCOVCONSULTMSGTBL")
    private F5750025HistPatDcovConsultMsgTbl histPatDcovConsultMsgTbl;

    @RpcField(length = 1, originalName = "HIST-PAT-DCOV-PREAUTH-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovPreauthInd;

    @RpcField(length = 338, originalName = "HIST-PAT-DCOV-FILLER-2", legacyType = MainFrameLegacyTypes.Char.class)
    private String histPatDcovFiller2;































    
}

