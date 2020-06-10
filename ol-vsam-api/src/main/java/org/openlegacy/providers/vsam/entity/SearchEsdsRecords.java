package org.openlegacy.providers.vsam.entity;

import lombok.Getter;
import lombok.Setter;
import org.openlegacy.core.annotations.common.Attribute;
import org.openlegacy.core.annotations.common.FieldAttributes;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;
import org.openlegacy.providers.vsam.VsamConstants;

import java.util.ArrayList;
import java.util.List;

@RpcEntity
@RpcActions(actions = {
    @Action(action = EXECUTE.class, path = "ESDSSC8")
})
@Getter
@Setter
public class SearchEsdsRecords implements org.openlegacy.core.rpc.RpcEntity {
    @RpcField(length = 40, legacyType = MainFrameLegacyTypes.ByteArray.class, direction = Direction.INPUT_OUTPUT)
    private byte[] key;
    @RpcField(length = 8, legacyType = MainFrameLegacyTypes.Char.class, direction = Direction.INPUT)
    private String fileName;
    @RpcField(length = 2, legacyType = MainFrameLegacyTypes.BinaryBigEndian.class, direction = Direction.INPUT)
    @RpcNumericField
    private Integer keyOffset;
    @RpcField(length = 2, legacyType = MainFrameLegacyTypes.BinaryBigEndian.class, direction = Direction.INPUT)
    @RpcNumericField
    private Integer keyLength;
    @RpcField(length = 2, legacyType = MainFrameLegacyTypes.BinaryBigEndian.class, direction = Direction.INPUT)
    @RpcNumericField
    private Integer recordLength = 14000;
    @RpcField(length = 4, legacyType = MainFrameLegacyTypes.BinaryBigEndian.class, direction = Direction.INPUT)
    @RpcNumericField
    private Integer numberOfRecords;
    @RpcField(direction = Direction.INPUT)
    @RpcList(count = 10)
    private final List<VsamSearchCriteria> searchCriteria = new ArrayList<>();
    @RpcField(direction = Direction.OUTPUT)
    @RpcList
    @FieldAttributes(attributes = {@Attribute(key = VsamConstants.RECORDS_INDICATOR_KEY, value = "true")})
    private final List<Object> records = new ArrayList<>();
}
