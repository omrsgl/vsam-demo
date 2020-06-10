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
@RpcPart(name = "F5750040HistDsubAdjudicationResults")
public class F5750040HistDsubAdjudicationResults {

    @RpcField(length = 4, originalName = "HIST-DSUB-COB-SAVINGS-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubCobSavingsAmt;

    @RpcField(length = 4, originalName = "HIST-DSUB-COB-SAVE-EXTEND-MAX", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubCobSaveExtendMax;

    @RpcField(length = 4, originalName = "HIST-DSUB-TOT-BENEFIT-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubTotBenefitAmt;

    @RpcField(length = 3, originalName = "HIST-DSUB-ORIG-BATCH-CYCLE-DT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999, maximumValue = 99999, decimalPlaces = 0)
    private Integer histDsubOrigBatchCycleDt;

    @RpcField(length = 4, originalName = "HIST-DSUB-TOT-PREVIOUS-ADJ-AMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999.99D, maximumValue = 99999.99D, decimalPlaces = 2)
    private Double histDsubTotPreviousAdjAmt;
    
}

