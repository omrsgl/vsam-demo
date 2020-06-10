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
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RpcPart(name = "F5750his")
public class F5750his {

    @RpcField(originalName = "HIST-TIME-STMP", displayName = "HISTTIMESTMP")
    private F5750hisHistTimeStmp histTimeStmp;

    @RpcField(originalName = "HIST-KEY", displayName = "HISTKEY")
    private F5750hisHistKey histKey;







    @Override
    public String toString() {
        try {
            return histKey.getKey();
        } catch (Exception e) {
            return "";
        }
    }
    
}

