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
@RpcPart(name = "VsaminqInputContainer")
public class VsaminqInputContainer {

    @RpcField(length = 8, originalName = "VSAM-CICS-FILENAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String vsamCicsFilename;
}

