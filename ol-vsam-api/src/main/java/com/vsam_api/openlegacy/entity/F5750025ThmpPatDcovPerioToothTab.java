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
@RpcPart(name = "F5750025ThmpPatDcovPerioToothTab")
public class F5750025ThmpPatDcovPerioToothTab {

    @RpcField(length = 5, originalName = "THMP-PAT-DCOV-PERIO-TOOTH-PROC", legacyType = MainFrameLegacyTypes.Char.class)
    private String thmpPatDcovPerioToothProc;

    @RpcField(originalName = "THMP-PAT-DCOV-PERIO-TOOTH-INFO", displayName = "THMPPATDCOVPERIOTOOTHINFO")
    @RpcList(count = 33)
    private List<F5750025ThmpPatDcovPerioToothInfo> thmpPatDcovPerioToothInfo;
    
}

