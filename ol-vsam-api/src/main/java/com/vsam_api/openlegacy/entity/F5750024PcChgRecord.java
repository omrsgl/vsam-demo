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
@RpcPart(name = "F5750024PcChgRecord")
public class F5750024PcChgRecord {

    @RpcField(length = 3, originalName = "PC-START-EXPDT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer pcStartExpdt;

    @RpcField(length = 1, originalName = "PC-COORD-BENE", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcCoordBene;

    @RpcField(length = 3, originalName = "PC-CYCLE-DT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer pcCycleDt;

    @RpcField(length = 3, originalName = "PC-DT-SERV", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer pcDtServ;

    @RpcField(length = 4, originalName = "PC-CHG-FEE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double pcChgFee;

    @RpcField(length = 5, originalName = "PC-PROC-RENDERED", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcProcRendered;

    @RpcField(length = 5, originalName = "PC-PROC-BENEFIT", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcProcBenefit;

    @RpcField(originalName = "PC-PROC-DED-MAX-TYPES", displayName = "PCPROCDEDMAXTYPES")
    private F5750024PcProcDedMaxTypes pcProcDedMaxTypes;

    @RpcField(length = 3, originalName = "PC-PROS-DATE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer pcProsDate;

    @RpcField(length = 2, originalName = "PC-TOOTH", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcTooth;

    @RpcField(length = 2, originalName = "PC-UNITS-QUAD-ARCH", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcUnitsQuadArch;

    @RpcField(length = 1, originalName = "PC-HOWPROC", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcHowproc;

    @RpcField(length = 1, originalName = "PC-OTHER-INS", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcOtherIns;

    @RpcField(length = 6, originalName = "PC-PROV-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcProvName;

    @RpcField(length = 7, originalName = "PC-PROV-PHONE", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcProvPhone;

    @RpcField(length = 2, originalName = "PC-PROV-STATE", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcProvState;

    @RpcField(length = 1, originalName = "PC-MEC-USED", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcMecUsed;

    @RpcField(length = 5, originalName = "PC-TH-SURFACES", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcThSurfaces;

    @RpcField(length = 1, originalName = "PC-UPDATE", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcUpdate;

    @RpcField(length = 2, originalName = "PC-STATUS", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcStatus;

    @RpcField(length = 2, originalName = "PC-CHG-ERROR", legacyType = MainFrameLegacyTypes.Char.class)
    private String pcChgError;

    @RpcField(originalName = "PC-DIC-CODE", displayName = "PCDICCODE")
    private F5750024PcDicCode pcDicCode;

    @RpcField(originalName = "PC-DIC-REASON", displayName = "PCDICREASON")
    private F5750024PcDicReason pcDicReason;

    @RpcField(originalName = "PC-FILE-CONTROL-NUM", displayName = "PCFILECONTROLNUM")
    private F5750024PcFileControlNum pcFileControlNum;

    @Hidden
    @RpcField(length = 9, originalName = "filler_6597706433717104", legacyType = MainFrameLegacyTypes.Char.class)
    private String filler6597706433717104;
    
}

