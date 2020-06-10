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
@RpcPart(name = "F5750044")
@PartAttributes(attributes = {@Attribute(key = VsamConstants.RECORD_TYPE_KEY, value = "044C")})
public class F5750044 extends F5750his {

    @RpcField(originalName = "HIST-DSUB-NAR-FIXED-AREA", displayName = "HISTDSUBNARFIXEDAREA")
    private F5750044HistDsubNarFixedArea histDsubNarFixedArea;

    @RpcField(originalName = "HIST-DSUB-NAR-VAR-AREA", displayName = "HISTDSUBNARVARAREA")
    private F5750044HistDsubNarVarArea histDsubNarVarArea;






    
}

