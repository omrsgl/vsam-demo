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
@RpcPart(name = "F5750040HistDsubChg")
public class F5750040HistDsubChg {

    @RpcField(length = 1, originalName = "HIST-DSUB-CHARGE-STATUS", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubChargeStatus;

    @RpcField(length = 3, originalName = "HIST-DSUB-DT-SERV", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubDtServ;

    @RpcField(length = 5, originalName = "HIST-DSUB-PROCDUR", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProcdur;

    @RpcField(length = 1, originalName = "HIST-DSUB-PROC-DED-TYPE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProcDedType;

    @RpcField(length = 1, originalName = "HIST-DSUB-PROC-MAX-TYPE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProcMaxType;

    @RpcField(length = 2, originalName = "HIST-DSUB-APRV-REF", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubAprvRef;

    @RpcField(length = 2, originalName = "HIST-DSUB-CMPR-REF", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubCmprRef;

    @RpcField(length = 2, originalName = "HIST-DSUB-CHG-COMMENT", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubChgComment;

    @RpcField(length = 2, originalName = "HIST-DSUB-CO-INS-PCT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9.99D, maximumValue = 9.99D, decimalPlaces = 2)
    private Double histDsubCoInsPct;

    @RpcField(length = 1, originalName = "HIST-DSUB-HOW-CALC", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubHowCalc;

    @RpcField(length = 2, originalName = "HIST-DSUB-UNITS", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubUnits;

    @RpcField(length = 1, originalName = "HIST-DSUB-SURFACE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubSurface;

    @RpcField(length = 2, originalName = "HIST-DSUB-TOOTH", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubTooth;

    @RpcField(length = 3, originalName = "HIST-DSUB-PROS-DATE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubProsDate;

    @RpcField(length = 3, originalName = "HIST-DSUB-DUPE-DATE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubDupeDate;

    @RpcField(length = 1, originalName = "HIST-DSUB-ACCIDENT", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubAccident;

    @RpcField(length = 1, originalName = "HIST-DSUB-PLACE-SER", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPlaceSer;

    @RpcField(length = 4, originalName = "HIST-DSUB-CHARGE-FEE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubChargeFee;

    @RpcField(length = 4, originalName = "HIST-DSUB-NON-DUP", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubNonDup;

    @RpcField(length = 4, originalName = "HIST-DSUB-COVERED-EXP", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubCoveredExp;

    @RpcField(length = 4, originalName = "HIST-DSUB-DEDUCTIBLE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubDeductible;

    @RpcField(length = 4, originalName = "HIST-DSUB-MAX-EXCEED-NC", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubMaxExceedNc;

    @RpcField(length = 1, originalName = "HIST-DSUB-CUTBACK-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubCutbackInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-LIMIT-TYPE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubLimitType;

    @RpcField(length = 4, originalName = "HIST-DSUB-RC-PRO", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubRcPro;

    @RpcField(length = 4, originalName = "HIST-DSUB-BENEFIT-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubBenefitAmt;

    @RpcField(length = 1, originalName = "HIST-DSUB-RC-PRO-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubRcProInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-LAST-CHG-IN-LUMP", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubLastChgInLump;

    @RpcField(length = 3, originalName = "HIST-DSUB-KEY-NUM", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubKeyNum;

    @RpcField(length = 4, originalName = "HIST-DSUB-CHG-GROUP", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histDsubChgGroup;

    @RpcField(length = 1, originalName = "HIST-DSUB-CHG-ORTHO-EOB-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubChgOrthoEobInd;

    @RpcField(length = 2, originalName = "HIST-DSUB-SCHED-NO", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histDsubSchedNo;

    @RpcField(length = 3, originalName = "HIST-DSUB-CHG-ORIG-B-CYCLE-DT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubChgOrigBCycleDt;

    @RpcField(length = 1, originalName = "HIST-DSUB-CHG-ALPHA-DIGIT", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubChgAlphaDigit;

    @RpcField(length = 4, originalName = "HIST-DSUB-MULTI-SCHED-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubMultiSchedAmt;

    @RpcField(length = 4, originalName = "HIST-DSUB-ORIGINAL-FEE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubOriginalFee;

    @RpcField(length = 2, originalName = "HIST-DSUB-PPO-NUMBER", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histDsubPpoNumber;

    @RpcField(length = 1, originalName = "HIST-DSUB-MEC-INDICATOR", legacyType = MainFrameLegacyTypes.NumZeroPaddedPositive.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 9, decimalPlaces = 0)
    private Integer histDsubMecIndicator;

    @RpcField(originalName = "HIST-DSUB-DIC-CODE", displayName = "HISTDSUBDICCODE")
    private F5750040HistDsubDicCode histDsubDicCode;

    @RpcField(originalName = "HIST-DSUB-DIC-REASON", displayName = "HISTDSUBDICREASON")
    private F5750040HistDsubDicReason histDsubDicReason;

    @RpcField(length = 5, originalName = "HIST-DSUB-TOOTH-SURFACES", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubToothSurfaces;

    @RpcField(length = 1, originalName = "HIST-DSUB-MCR-REP", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubMcrRep;

    @RpcField(length = 4, originalName = "HIST-DSUB-FEE-DIFF-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubFeeDiffAmt;

    @RpcField(length = 4, originalName = "HIST-DSUB-PAT-COST-SHARE-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubPatCostShareAmt;

    @RpcField(length = 4, originalName = "HIST-DSUB-ORTHO-MAX-INV-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubOrthoMaxInvAmt;

    @RpcField(length = 1, originalName = "HIST-DSUB-MANUAL-INV", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubManualInv;

    @RpcField(length = 2, originalName = "HIST-DSUB-NET-FEE-PCT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9.99D, maximumValue = 9.99D, decimalPlaces = 2)
    private Double histDsubNetFeePct;

    @RpcField(length = 4, originalName = "HIST-DSUB-OUT-NET-EXP", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubOutNetExp;

    @RpcField(length = 4, originalName = "HIST-DSUB-VENDOR-SAVING", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubVendorSaving;

    @RpcField(length = 1, originalName = "HIST-DSUB-TYPE-SCHED", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubTypeSched;

    @RpcField(length = 4, originalName = "HIST-DSUB-CHG-PAT-RESP-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubChgPatRespAmt;

    @RpcField(length = 1, originalName = "HIST-DSUB-CHG-PR-ACTION", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubChgPrAction;

    @RpcField(length = 4, originalName = "HIST-DSUB-CHG-PDP-SAVE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubChgPdpSave;

    @RpcField(originalName = "HIST-DSUB-CHG-PRINT-SWITCHES", displayName = "HISTDSUBCHGPRINTSWITCHES")
    private F5750040HistDsubChgPrintSwitches histDsubChgPrintSwitches;

    @RpcField(length = 4, originalName = "HIST-DSUB-OOP-EXP-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubOopExpAmt;

    @RpcField(length = 4, originalName = "HIST-DSUB-ADDL-BEN-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubAddlBenAmt;

    @RpcField(length = 1, originalName = "HIST-DSUB-EHB-PROC-CD", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubEhbProcCd;

    @RpcField(length = 1, originalName = "HIST-DSUB-EHB-ELG", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubEhbElg;

    @RpcField(length = 4, originalName = "HIST-DSUB-PREV-VEN-SAVING", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubPrevVenSaving;

    @RpcField(length = 4, originalName = "HIST-DSUB-VENDOR-SAVING-ADJ", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubVendorSavingAdj;

    @RpcField(length = 4, originalName = "HIST-DSUB-RETAINED-SAVING", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubRetainedSaving;

    @RpcField(length = 4, originalName = "HIST-DSUB-RETAINED-SAVING-ADJ", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubRetainedSavingAdj;

    @RpcField(length = 2, originalName = "HIST-DSUB-NETWORK-ID", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histDsubNetworkId;

    @RpcField(length = 1, originalName = "HIST-DSUB-VEND-TYPE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubVendType;

    @RpcField(length = 1, originalName = "HIST-DSUB-GHOST-LINE-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubGhostLineInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-SYS-DOWNCD-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubSysDowncdInd;

    @RpcField(length = 10, originalName = "HIST-DSUB-CHG-FILLER", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubChgFiller;
    
}

