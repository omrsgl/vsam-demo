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
@RpcPart(name = "F5750040HistDsubNewProvKey")
public class F5750040HistDsubNewProvKey {

    @RpcField(length = 5, originalName = "HIST-DSUB-PRVD-ID", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999999999, maximumValue = 999999999, decimalPlaces = 0)
    private Integer histDsubPrvdId;

    @RpcField(length = 5, originalName = "HIST-DSUB-LOC-ID", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999999999, maximumValue = 999999999, decimalPlaces = 0)
    private Integer histDsubLocId;

    @RpcField(length = 5, originalName = "HIST-DSUB-LGL-ENTY-ID", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999999999, maximumValue = 999999999, decimalPlaces = 0)
    private Integer histDsubLglEntyId;

    @RpcField(length = 12, originalName = "HIST-DSUB-PROV-FRST-NM", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProvFrstNm;

    @RpcField(length = 20, originalName = "HIST-DSUB-PROV-LAST-NM", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubProvLastNm;

    @RpcField(length = 32, originalName = "HIST-DSUB-LEGAL-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubLegalName;

    @RpcField(length = 2, originalName = "HIST-DSUB-REND-ST-CD", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubRendStCd;

    @RpcField(length = 5, originalName = "HIST-DSUB-REND-ADR-5", legacyType = MainFrameLegacyTypes.Char.class)
    private String histDsubRendAdr5;
    
}

