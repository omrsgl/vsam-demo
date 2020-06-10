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
@RpcPart(name = "F5750040HistDsubPdpSav")
public class F5750040HistDsubPdpSav {

    @RpcField(length = 5, originalName = "HIST-DSUB-PDP-WOULD-SAVE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubPdpWouldSave;

    @RpcField(length = 5, originalName = "HIST-DSUB-PDP-HAS-SAVED", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999.99D, maximumValue = 9999999.99D, decimalPlaces = 2)
    private Double histDsubPdpHasSaved;
    
}

