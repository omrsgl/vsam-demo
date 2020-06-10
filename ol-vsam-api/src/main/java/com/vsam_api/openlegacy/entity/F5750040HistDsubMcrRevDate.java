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
@RpcPart(name = "F5750040HistDsubMcrRevDate")
public class F5750040HistDsubMcrRevDate {

    @RpcField(length = 2, originalName = "HIST-DSUB-MCR-REV-CY", legacyType = MainFrameLegacyTypes.NumZeroPaddedPositive.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 99, decimalPlaces = 0)
    private Integer histDsubMcrRevCy;

    @RpcField(length = 2, originalName = "HIST-DSUB-MCR-REV-YY", legacyType = MainFrameLegacyTypes.NumZeroPaddedPositive.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 99, decimalPlaces = 0)
    private Integer histDsubMcrRevYy;

    @RpcField(length = 2, originalName = "HIST-DSUB-MCR-REV-MM", legacyType = MainFrameLegacyTypes.NumZeroPaddedPositive.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 99, decimalPlaces = 0)
    private Integer histDsubMcrRevMm;

    @RpcField(length = 2, originalName = "HIST-DSUB-MCR-REV-DD", legacyType = MainFrameLegacyTypes.NumZeroPaddedPositive.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 99, decimalPlaces = 0)
    private Integer histDsubMcrRevDd;
    
}

