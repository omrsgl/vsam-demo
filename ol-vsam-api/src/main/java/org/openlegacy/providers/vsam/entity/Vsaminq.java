package org.openlegacy.providers.vsam.entity;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;
import lombok.Getter;
import lombok.Setter;

@RpcEntity
@RpcActions(actions = {
    @Action(action = EXECUTE.class, path = "VSAMINQ")
})
@Getter
@Setter
public class Vsaminq implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(originalName = "INPUT-CONTAINER", displayName = "INPUTCONTAINER", direction = Direction.INPUT)
    private VsaminqInputContainer inputContainer;

    @RpcField(originalName = "OUTPUT-CONTAINER", displayName = "OUTPUTCONTAINER", direction = Direction.OUTPUT)
    private VsaminqOutputContainer outputContainer;


}

