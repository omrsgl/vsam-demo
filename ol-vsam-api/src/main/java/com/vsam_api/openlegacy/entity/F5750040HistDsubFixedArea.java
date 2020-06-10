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
@RpcPart(name = "F5750040HistDsubFixedArea")
public class F5750040HistDsubFixedArea {

    @RpcField(length = 4, originalName = "HIST-DSUB-GROUP-NO", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histDsubGroupNo;

    @RpcField(length = 4, originalName = "HIST-DSUB-SUB-DIV", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubSubDiv;

    @RpcField(length = 4, originalName = "HIST-DSUB-BRANCH", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubBranch;

    @RpcField(length = 2, originalName = "HIST-DSUB-PLAN", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPlan;

    @RpcField(length = 3, originalName = "HIST-DSUB-START-EXPENSE-DATE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubStartExpenseDate;

    @RpcField(length = 3, originalName = "HIST-DSUB-DATE-ENT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubDateEnt;

    @RpcField(length = 1, originalName = "HIST-DSUB-OTHER-INS", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubOtherIns;

    @RpcField(length = 1, originalName = "HIST-DSUB-WORK-COMP", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubWorkComp;

    @RpcField(length = 1, originalName = "HIST-DSUB-STUDENT", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubStudent;

    @RpcField(length = 1, originalName = "HIST-DSUB-HANDICAP", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubHandicap;

    @RpcField(length = 1, originalName = "HIST-DSUB-NARR-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNarrInd;

    @RpcField(length = 3, originalName = "HIST-DSUB-ACCIDENT-DATE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubAccidentDate;

    @RpcField(length = 1, originalName = "HIST-DSUB-INIT-PLACEMENT", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubInitPlacement;

    @RpcField(length = 6, originalName = "HIST-DSUB-IMG-DOC-SEQ", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubImgDocSeq;

    @RpcField(length = 1, originalName = "HIST-DSUB-CCD-CLAIM-LEVEL-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubCcdClaimLevelInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-UIS-SPECIAL-STATUS", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubUisSpecialStatus;

    @RpcField(length = 1, originalName = "HIST-DSUB-PROV-EFT-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProvEftInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-UIS-FSA-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubUisFsaInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-XRAY-PICKLIST-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubXrayPicklistInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-COORD-BENE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubCoordBene;

    @RpcField(length = 4, originalName = "HIST-DSUB-AMT-PD-EMP", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubAmtPdEmp;

    @RpcField(length = 4, originalName = "HIST-DSUB-NC-ALLOW", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubNcAllow;

    @RpcField(length = 4, originalName = "HIST-DSUB-OI-AMOUNT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubOiAmount;

    @RpcField(length = 4, originalName = "HIST-DSUB-PAY-REDUC", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubPayReduc;

    @RpcField(originalName = "HIST-DSUB-CLAIM-OVERRIDE", displayName = "HISTDSUBCLAIMOVERRIDE")
    private F5750040HistDsubClaimOverride histDsubClaimOverride;

    @RpcField(length = 1, originalName = "HIST-DSUB-HOW-PROCESSED", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubHowProcessed;

    @RpcField(length = 1, originalName = "HIST-DSUB-ASSIGNED", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubAssigned;

    @RpcField(originalName = "HIST-DSUB-PROVIDER", displayName = "HISTDSUBPROVIDER")
    private F5750040HistDsubProvider histDsubProvider;

    @RpcField(originalName = "HIST-DSUB-INTERNAL-ADJUSTMENT", displayName = "HISTDSUBINTERNALADJUSTMENT")
    private F5750040HistDsubInternalAdjustment histDsubInternalAdjustment;

    @RpcField(length = 1, originalName = "HIST-DSUB-ORTHO-PAY-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubOrthoPayInd;

    @RpcField(originalName = "HIST-DSUB-ADJUDICATION-RESULTS", displayName = "HISTDSUBADJUDICATIONRESULTS")
    private F5750040HistDsubAdjudicationResults histDsubAdjudicationResults;

    @RpcField(length = 1, originalName = "HIST-DSUB-CLAIM-STATUS", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubClaimStatus;

    @RpcField(originalName = "HIST-DSUB-REP-ORTHO-OTHER-COV", displayName = "HISTDSUBREPORTHOOTHERCOV")
    private F5750040HistDsubRepOrthoOtherCov histDsubRepOrthoOtherCov;

    @RpcField(originalName = "HIST-DSUB-LETTER-DATES", displayName = "HISTDSUBLETTERDATES")
    private F5750040HistDsubLetterDates histDsubLetterDates;

    @RpcField(length = 1, originalName = "HIST-DSUB-TCA-INDICATOR", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubTcaIndicator;

    @RpcField(length = 3, originalName = "HIST-DSUB-EFF-DT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubEffDt;

    @RpcField(length = 3, originalName = "HIST-DSUB-CANC-DT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubCancDt;

    @RpcField(length = 1, originalName = "HIST-DSUB-OVERPAY-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubOverpayInd;

    @RpcField(length = 1203, originalName = "HIST-DSUB-J-EOB-INFO-ALL", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubJEobInfoAll;

    @RpcField(length = 4, originalName = "HIST-DSUB-TOT-CHG-BEN", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubTotChgBen;

    @RpcField(length = 4, originalName = "HIST-DSUB-PREV-PAY-TOT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubPrevPayTot;

    @RpcField(length = 4, originalName = "HIST-DSUB-BENEFIT-DUE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubBenefitDue;

    @RpcField(length = 1, originalName = "HIST-DSUB-TEMP-SUB-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubTempSubInd;

    @RpcField(length = 4, originalName = "HIST-DSUB-OVERPAY-ALLOW", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubOverpayAllow;

    @RpcField(length = 1, originalName = "HIST-DSUB-ORTHO-ADJUSTED-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubOrthoAdjustedInd;

    @RpcField(length = 4, originalName = "HIST-DSUB-ORTHO-MAX-PREP", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubOrthoMaxPrep;

    @RpcField(length = 4, originalName = "HIST-DSUB-ORTHO-MONTHLY", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubOrthoMonthly;

    @RpcField(length = 1, originalName = "HIST-DSUB-CONVERS-MON-ORTH-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubConversMonOrthInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-SURVIVING-SP-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubSurvivingSpInd;

    @RpcField(length = 20, originalName = "HIST-DSUB-SURVIVING-SP-LNME", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubSurvivingSpLnme;

    @RpcField(length = 12, originalName = "HIST-DSUB-SURVIVING-SP-FNME", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubSurvivingSpFnme;

    @RpcField(originalName = "HIST-DSUB-PAT-INFORCE-INFO", displayName = "HISTDSUBPATINFORCEINFO")
    private F5750040HistDsubPatInforceInfo histDsubPatInforceInfo;

    @RpcField(length = 4, originalName = "HIST-DSUB-INFORCE-NUMBER", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histDsubInforceNumber;

    @RpcField(length = 1, originalName = "HIST-DSUB-MET-FAM-DED", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubMetFamDed;

    @RpcField(length = 1, originalName = "HIST-DSUB-OTHER-FC-DIGIT", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubOtherFcDigit;

    @RpcField(length = 1, originalName = "HIST-DSUB-OTHER-REL", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubOtherRel;

    @RpcField(length = 2, originalName = "HIST-DSUB-OTHER-REL-SEQ", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histDsubOtherRelSeq;

    @RpcField(length = 1, originalName = "HIST-DSUB-DPLN-CUS-PCAS-BY", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubDplnCusPcasBy;

    @RpcField(length = 1, originalName = "HIST-DSUB-XRAYS-INCLUDED", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubXraysIncluded;

    @RpcField(length = 1, originalName = "HIST-DSUB-OTHER-COVERAGES", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubOtherCoverages;

    @RpcField(length = 1, originalName = "HIST-DSUB-ECS-INDICATOR", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubEcsIndicator;

    @RpcField(length = 1, originalName = "HIST-DSUB-EFT-DAYS", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubEftDays;

    @RpcField(length = 1, originalName = "HIST-DSUB-APPEAL-LEVEL", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubAppealLevel;

    @RpcField(length = 1, originalName = "HIST-DSUB-APPEAL-CATEGORY", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubAppealCategory;

    @RpcField(length = 1, originalName = "HIST-DSUB-APPEAL-SUBMITTER", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubAppealSubmitter;

    @RpcField(length = 4, originalName = "HIST-DSUB-APPEAL-START-DATE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histDsubAppealStartDate;

    @RpcField(length = 4, originalName = "HIST-DSUB-APPEAL-COMPLETE-DT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histDsubAppealCompleteDt;

    @RpcField(length = 1, originalName = "HIST-DSUB-DOMESTIC-PART-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubDomesticPartInd;

    @RpcField(length = 5, originalName = "HIST-DSUB-PAT-SS-NO", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999999999, maximumValue = 999999999, decimalPlaces = 0)
    private Integer histDsubPatSsNo;

    @RpcField(length = 1, originalName = "HIST-DSUB-ORIG-REPT-ORTHO", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubOrigReptOrtho;

    @RpcField(length = 1, originalName = "HIST-DSUB-ORIG-APPL-FST", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubOrigApplFst;

    @RpcField(length = 3, originalName = "HIST-DSUB-PPAY-DAYS-LATE", legacyType = MainFrameLegacyTypes.NumZeroPaddedPositive.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 999, decimalPlaces = 0)
    private Integer histDsubPpayDaysLate;

    @RpcField(length = 1, originalName = "HIST-DSUB-PPAY-BULKOVR", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPpayBulkovr;

    @RpcField(length = 1, originalName = "HIST-DSUB-PPAY-ACK-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPpayAckInd;

    @RpcField(length = 2, originalName = "HIST-DSUB-PPAY-SITUS-STATE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPpaySitusState;

    @RpcField(length = 1, originalName = "HIST-DSUB-PPAY-STATE-CLASS", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPpayStateClass;

    @RpcField(length = 5, originalName = "HIST-DSUB-PPAY-PERCENT", legacyType = MainFrameLegacyTypes.PositiveNumAnyDecimal.class)
    @RpcNumericField(minimumValue = 0D, maximumValue = 99.999D, decimalPlaces = 3)
    private Double histDsubPpayPercent;

    @RpcField(length = 1, originalName = "HIST-DSUB-FINALIZE-ORTHO", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubFinalizeOrtho;

    @RpcField(length = 1, originalName = "HIST-DSUB-OFAC-SUSP", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubOfacSusp;

    @RpcField(length = 2, originalName = "HIST-DSUB-PROV-ALT-ST", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProvAltSt;

    @RpcField(length = 1, originalName = "HIST-DSUB-FSA-VENDOR-ID-OLD", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubFsaVendorIdOld;

    @RpcField(length = 10, originalName = "HIST-DSUB-PROV-NPI", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProvNpi;

    @RpcField(length = 9, originalName = "HIST-DSUB-PROV-TIN", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProvTin;

    @RpcField(length = 15, originalName = "HIST-DSUB-PROV-LIC", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProvLic;

    @RpcField(length = 10, originalName = "HIST-DSUB-PROV-EHT-ORIG-NPI", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProvEhtOrigNpi;

    @RpcField(length = 15, originalName = "HIST-DSUB-PROV-EHT-ORIG-LIC", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProvEhtOrigLic;

    @RpcField(length = 1, originalName = "HIST-DSUB-QUE-WORKPLACE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubQueWorkplace;

    @RpcField(length = 1, originalName = "HIST-DSUB-QUE-WORKPLACE-REASON", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubQueWorkplaceReason;

    @RpcField(length = 3, originalName = "HIST-DSUB-FEDERAL-FEHB-PLAN", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubFederalFehbPlan;

    @RpcField(length = 1, originalName = "HIST-DSUB-ALT-ADDR-INDICATOR", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubAltAddrIndicator;

    @RpcField(length = 1, originalName = "HIST-DSUB-PKT-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPktInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-SLI-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubSliInd;

    @RpcField(length = 3, originalName = "HIST-DSUB-FSA-VENDOR-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubFsaVendorId;

    @RpcField(length = 1, originalName = "HIST-DSUB-FSA-ALT-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubFsaAltId;

    @RpcField(length = 1, originalName = "HIST-DSUB-RISK-MGT-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubRiskMgtInd;

    @RpcField(length = 4, originalName = "HIST-DSUB-FSA-OI-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubFsaOiAmt;

    @RpcField(length = 1, originalName = "HIST-DSUB-GOSC-MSG-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubGoscMsgInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-PDPNCS-MSG-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPdpncsMsgInd;

    @RpcField(length = 8, originalName = "HIST-DSUB-MCR-RACF-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubMcrRacfId;

    @RpcField(originalName = "HIST-DSUB-MCR-REV-DATE", displayName = "HISTDSUBMCRREVDATE")
    private F5750040HistDsubMcrRevDate histDsubMcrRevDate;

    @RpcField(originalName = "HIST-DSUB-PDP-SAV", displayName = "HISTDSUBPDPSAV")
    private F5750040HistDsubPdpSav histDsubPdpSav;

    @RpcField(length = 3, originalName = "HIST-DSUB-BILL-PROV-CTRY-CDE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubBillProvCtryCde;

    @RpcField(length = 3, originalName = "HIST-DSUB-REND-PROV-CTRY-CDE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubRendProvCtryCde;

    @RpcField(length = 1, originalName = "HIST-DSUB-FULL-ORTHO-MAX-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubFullOrthoMaxInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-FRGNCURNCY-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubFrgncurncyInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-FRGNPROV-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubFrgnprovInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-CONUS-OCONUS", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubConusOconus;

    @RpcField(length = 1, originalName = "HIST-DSUB-OCONUS-INVOICE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubOconusInvoice;

    @RpcField(length = 20, originalName = "HIST-DSUB-PAT-LAST-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPatLastName;

    @RpcField(length = 10, originalName = "HIST-DSUB-PAT-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPatId;

    @RpcField(originalName = "HIST-DSUB-PAT-CAREOF", displayName = "HISTDSUBPATCAREOF")
    private F5750040HistDsubPatCareof histDsubPatCareof;

    @RpcField(originalName = "HIST-DSUB-PAT-STREET", displayName = "HISTDSUBPATSTREET")
    private F5750040HistDsubPatStreet histDsubPatStreet;

    @RpcField(length = 8, originalName = "HIST-DSUB-PAT-PHONE-NUMBER", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(decimalPlaces = 0)
    private BigInteger histDsubPatPhoneNumber;

    @RpcField(length = 8, originalName = "HIST-DSUB-PROV-LIC-EXP-DATE", legacyType = MainFrameLegacyTypes.NumZeroPaddedPositive.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 99999999, decimalPlaces = 0)
    private Integer histDsubProvLicExpDate;

    @RpcField(length = 4, originalName = "HIST-DSUB-EMP-ADD-START-DATE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histDsubEmpAddStartDate;

    @RpcField(length = 3, originalName = "HIST-DSUB-EMP-COUNTRY-CODE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubEmpCountryCode;

    @RpcField(length = 9, originalName = "HIST-DSUB-EMP-FOREIGN-ZIP", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubEmpForeignZip;

    @RpcField(length = 1, originalName = "HIST-DSUB-BRANCH-OF-SERVICE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubBranchOfService;

    @RpcField(length = 1, originalName = "HIST-DSUB-READINESS-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubReadinessInd;

    @RpcField(length = 11, originalName = "HIST-DSUB-MBR-ADMIN-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubMbrAdminId;

    @RpcField(length = 10, originalName = "HIST-DSUB-NEA-NBR", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNeaNbr;

    @RpcField(length = 1, originalName = "HIST-DSUB-TRI-OHI-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubTriOhiInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-PAT-MAJOR-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPatMajorInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-PLN-ACC-TYPE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPlnAccType;

    @RpcField(length = 4, originalName = "HIST-DSUB-TOT-INV-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubTotInvAmt;

    @RpcField(originalName = "HIST-DSUB-CHK-DENTAL-REC", displayName = "HISTDSUBCHKDENTALREC")
    private F5750040HistDsubChkDentalRec histDsubChkDentalRec;

    @RpcField(length = 3, originalName = "HIST-DSUB-VENDOR-ID", legacyType = MainFrameLegacyTypes.NumZeroPaddedPositive.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 999, decimalPlaces = 0)
    private Integer histDsubVendorId;

    @RpcField(length = 2, originalName = "HIST-DSUB-VENDOR-PMT-PCT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -0.999D, maximumValue = 0.999D, decimalPlaces = 3)
    private Double histDsubVendorPmtPct;

    @RpcField(length = 1, originalName = "HIST-DSUB-MAX-SUPPR-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubMaxSupprInd;

    @RpcField(length = 4, originalName = "HIST-DSUB-PREV-NET-FEE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubPrevNetFee;

    @RpcField(length = 4, originalName = "HIST-DSUB-CURR-NET-FEE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubCurrNetFee;

    @RpcField(length = 4, originalName = "HIST-DSUB-MEDICAL-EXP", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubMedicalExp;

    @RpcField(length = 1, originalName = "HIST-DSUB-MEDICAL-COB-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubMedicalCobInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-PAT-RESP-ACTION", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPatRespAction;

    @RpcField(length = 1, originalName = "HIST-DSUB-PAT-RESP-ADJUST", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubPatRespAdjust;

    @RpcField(originalName = "HIST-DSUB-EFT-TRACE-REC", displayName = "HISTDSUBEFTTRACEREC")
    private F5750040HistDsubEftTraceRec histDsubEftTraceRec;

    @RpcField(length = 5, originalName = "HIST-DSUB-HCR-PLAN-TYPE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubHcrPlanType;

    @RpcField(length = 5, originalName = "HIST-DSUB-IND-OOP-MAX", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubIndOopMax;

    @RpcField(length = 5, originalName = "HIST-DSUB-FAM-OOP-MAX", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubFamOopMax;

    @RpcField(length = 5, originalName = "HIST-DSUB-IND-OOP-ACC-MAX", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubIndOopAccMax;

    @RpcField(length = 5, originalName = "HIST-DSUB-FAM-OOP-ACC-MAX", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubFamOopAccMax;

    @RpcField(length = 38, originalName = "HIST-DSUB-INS-PDF-KEY", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubInsPdfKey;

    @RpcField(length = 2, originalName = "HIST-DSUB-MUR-STATE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubMurState;

    @RpcField(length = 1, originalName = "HIST-DSUB-MCR-EOB-CRED-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubMcrEobCredInd;

    @RpcField(length = 3, originalName = "HIST-DSUB-DATE-PROCESSED", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubDateProcessed;

    @RpcField(length = 1, originalName = "HIST-DSUB-NET-VENDOR-NET-BYP", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNetVendorNetByp;

    @RpcField(length = 1, originalName = "HIST-DSUB-NET-VENDOR-RET-BYP", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubNetVendorRetByp;

    @RpcField(length = 1, originalName = "HIST-DSUB-CTADJ-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubCtadjInd;

    @RpcField(length = 1, originalName = "HIST-DSUB-ADJUSTED-CLAIM", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubAdjustedClaim;

    @RpcField(length = 1, originalName = "HIST-DSUB-OVRPAY-PROJECT-TYP", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubOvrpayProjectTyp;

    @RpcField(length = 2, originalName = "HIST-DSUB-OVRPAY-REASON-TYP", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubOvrpayReasonTyp;

    @RpcField(length = 1, originalName = "HIST-DSUB-OVRPAY-LETTER-TYP", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubOvrpayLetterTyp;

    @RpcField(length = 3, originalName = "HIST-DSUB-DISCOVERY-DATE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubDiscoveryDate;

    @RpcField(length = 1, originalName = "HIST-DSUB-MYBENEFITS-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubMybenefitsInd;

    @RpcField(originalName = "HIST-DSUB-NEW-PROV-KEY", displayName = "HISTDSUBNEWPROVKEY")
    private F5750040HistDsubNewProvKey histDsubNewProvKey;

    @RpcField(length = 1, originalName = "HIST-DSUB-ST-RULE-IND", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubStRuleInd;

    @RpcField(originalName = "HIST-DSUB-NEW-AREA", displayName = "HISTDSUBNEWAREA")
    private F5750040HistDsubNewArea histDsubNewArea;

    @RpcField(length = 2, originalName = "HIST-DSUB-SEG-COUNT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histDsubSegCount;
    
}

