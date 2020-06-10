package com.vsam_api.openlegacy.entity;


import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vsam_api.openlegacy.util.VsamConvertUtil;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RpcPart(name = "F5750025HistPatDcovLifeTotalsBen")
public class F5750025HistPatDcovLifeTotalsBen {

    @RpcField(originalName = "HIST-PAT-DCOV-LTT-G", displayName = "HISTPATDCOVLTTG")
    @RpcList(count = 8)
    private List<F5750025HistPatDcovLttG> histPatDcovLttG;
    
}

