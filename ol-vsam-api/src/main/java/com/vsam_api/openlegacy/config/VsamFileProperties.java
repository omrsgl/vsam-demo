package com.vsam_api.openlegacy.config;

import com.vsam_api.openlegacy.constants.VsamFileType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "ol.vsam")
public class VsamFileProperties {

    private List<VsamFile> files;
    private Map<VsamFileType, VsamFileTypeDefaults> fileTypesDefaults;

    @Getter
    @Setter
    public static class VsamFile {
        String name;
        VsamFileType type = VsamFileType.KSDS;
        Integer keyOffset;
        Integer keyLength;
        Integer recordMaxLength;
        List<String> partNames;
    }

    @Getter
    @Setter
    public static class VsamFileTypeDefaults {
        Integer keyOffset;
        Integer keyLength;
        Integer recordMaxLength;
    }
}
