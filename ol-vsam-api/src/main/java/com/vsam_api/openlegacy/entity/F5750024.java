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
@RpcPart(name = "F5750024")
@PartAttributes(attributes = {@Attribute(key = VsamConstants.RECORD_TYPE_KEY, value = "024C")})
public class F5750024 extends F5750his {

    @RpcField(length = 2, originalName = "PC-NBR-CHGS", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer pcNbrChgs;

    @RpcField(originalName = "PC-CHG-HIST", displayName = "PCCHGHIST")
    @RpcList(count = 90)
    private List<F5750024PcChgHist> pcChgHist;







    
}

