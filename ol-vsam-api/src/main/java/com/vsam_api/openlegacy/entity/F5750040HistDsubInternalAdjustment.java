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
@RpcPart(name = "F5750040HistDsubInternalAdjustment")
public class F5750040HistDsubInternalAdjustment {

    @RpcField(length = 4, originalName = "HIST-DSUB-FC-POINTER-DATE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histDsubFcPointerDate;

    @RpcField(length = 3, originalName = "HIST-DSUB-FC-POINTER-SEQ", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubFcPointerSeq;

    @RpcField(length = 2, originalName = "HIST-DSUB-FC-POINTER-OFF", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histDsubFcPointerOff;

    @RpcField(length = 1, originalName = "HIST-DSUB-FC-POINTER-ESEQ", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9, maximumValue = 9, decimalPlaces = 0)
    private Integer histDsubFcPointerEseq;

    @RpcField(length = 1, originalName = "HIST-DSUB-FC-POINTER-CONT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9, maximumValue = 9, decimalPlaces = 0)
    private Integer histDsubFcPointerCont;

    @RpcField(originalName = "HIST-DSUB-ADJ", displayName = "HISTDSUBADJ")
    private F5750040HistDsubAdj histDsubAdj;
    
}

