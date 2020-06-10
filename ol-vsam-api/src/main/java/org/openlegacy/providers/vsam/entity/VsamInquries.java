package org.openlegacy.providers.vsam.entity;

import lombok.Getter;
import lombok.Setter;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;

@RpcEntity
@RpcActions(actions = {
    @Action(action = EXECUTE.class, path = "VSAMINQ")
})
@Getter
@Setter
public class VsamInquries implements org.openlegacy.core.rpc.RpcEntity {
    @RpcField(length = 8, legacyType = MainFrameLegacyTypes.Char.class, direction = Direction.INPUT)
    private String fileName;
    @RpcField(length = 2, legacyType = MainFrameLegacyTypes.BinaryBigEndian.class, direction = Direction.OUTPUT)
    @RpcNumericField
    private Integer keyOffset;
    @RpcField(length = 2, legacyType = MainFrameLegacyTypes.BinaryBigEndian.class, direction = Direction.OUTPUT)
    @RpcNumericField
    private Integer keyLength;
    @RpcField(length = 2, legacyType = MainFrameLegacyTypes.BinaryBigEndian.class, direction = Direction.OUTPUT)
    @RpcNumericField
    private Integer recordLength;
    @RpcField(length = 4, legacyType = MainFrameLegacyTypes.Char.class, direction = Direction.OUTPUT)
    private String fileType;
    @RpcField(length = 8, legacyType = MainFrameLegacyTypes.Char.class, direction = Direction.OUTPUT)
    private String rbaType;
}
