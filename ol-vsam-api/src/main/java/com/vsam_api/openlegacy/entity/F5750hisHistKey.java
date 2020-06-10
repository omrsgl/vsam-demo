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
@RpcPart(name = "F5750hisHistKey")
public class F5750hisHistKey {

    @RpcField(length = 4, originalName = "HIST-KEY-CUSTOMER", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -9999999, maximumValue = 9999999, decimalPlaces = 0)
    private Integer histKeyCustomer;

    @RpcField(length = 11, originalName = "HIST-KEY-EMPLOYEE-NO", legacyType = MainFrameLegacyTypes.Char.class)
    private String histKeyEmployeeNo;

    @RpcField(originalName = "HIST-KEY-PATIENT", displayName = "HISTKEYPATIENT")
    private F5750hisHistKeyPatient histKeyPatient;

    @RpcField(length = 1, originalName = "HIST-KEY-COV-TYPE", legacyType = MainFrameLegacyTypes.Char.class)
    private String histKeyCovType;

    @RpcField(length = 9, originalName = "HIST-KEY-FCN", legacyType = MainFrameLegacyTypes.Char.class)
    private String histKeyFcn;

    @RpcField(length = 2, originalName = "HIST-KEY-SEQ", legacyType = MainFrameLegacyTypes.Char.class)
    private String histKeySeq;

    @RpcField(length = 2, originalName = "HIST-KEY-REC-TYPE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -999, maximumValue = 999, decimalPlaces = 0)
    private Integer histKeyRecType;
    
    @JsonIgnore
    public String getKey() throws Exception {
        return new StringBuilder()
                .append(VsamConvertUtil.convertPackedDecimal(histKeyCustomer, 4, 0))
                .append(VsamConvertUtil.convertChar(histKeyEmployeeNo, 11))
                .append(histKeyPatient.getKey())
                .append(VsamConvertUtil.convertChar(histKeyCovType, 1))
                .append(VsamConvertUtil.convertChar(histKeyFcn, 9))
                .append(VsamConvertUtil.convertChar(histKeySeq, 2))
                .append(VsamConvertUtil.convertPackedDecimal(histKeyRecType, 2, 0))
                .toString();
    }
}

