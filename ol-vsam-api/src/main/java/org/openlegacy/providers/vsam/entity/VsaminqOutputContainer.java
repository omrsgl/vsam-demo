package org.openlegacy.providers.vsam.entity;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RpcPart(name = "VsaminqOutputContainer")
public class VsaminqOutputContainer {

    @RpcField(length = 2, originalName = "KEY-OFFSET", legacyType = MainFrameLegacyTypes.BinaryBigEndian.class, defaultValue = "0")
    @RpcNumericField(minimumValue = -9999, maximumValue = 9999, decimalPlaces = 0)
    private Integer keyOffset;

    @RpcField(length = 2, originalName = "KEY-LENGTH", legacyType = MainFrameLegacyTypes.BinaryBigEndian.class, defaultValue = "0")
    @RpcNumericField(minimumValue = -9999, maximumValue = 9999, decimalPlaces = 0)
    private Integer keyLength;

    @RpcField(length = 2, originalName = "RECORD-LENGTH", legacyType = MainFrameLegacyTypes.BinaryBigEndian.class, defaultValue = "0")
    @RpcNumericField(minimumValue = -9999, maximumValue = 9999, decimalPlaces = 0)
    private Integer recordLength;

    @RpcField(length = 4, originalName = "FILE-TYPE", legacyType = MainFrameLegacyTypes.Char.class, defaultValue = " ")
    private String fileType;

    @RpcField(length = 8, originalName = "RBATYPE", legacyType = MainFrameLegacyTypes.Char.class, defaultValue = " ")
    private String rbatype;
}

