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
@RpcPart(name = "F5750044Filler33401794129281415")
public class F5750044Filler33401794129281415 {

    @RpcField(originalName = "filler_9429138795312847", displayName = "Filler 9429138795312847")
    @RpcList(count = 5)
    private List<F5750044Filler9429138795312847> filler9429138795312847;
    
}

