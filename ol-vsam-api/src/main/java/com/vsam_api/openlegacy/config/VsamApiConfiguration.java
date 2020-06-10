package com.vsam_api.openlegacy.config;

import java.util.Map;

import org.openlegacy.impl.debug.InternalDebugWrapper;
import org.openlegacy.impl.properties.OLDebugProperties;
import org.openlegacy.impl.tracing.TracingExecutor;
import org.openlegacy.providers.mfrpc.customizer.CicsHttpRequestCustomizer;
import org.openlegacy.providers.mfrpc.properties.OLCicsProperties;
import org.openlegacy.providers.mfrpc.transporter.MfRpcHttpTransporterFactory;
import org.openlegacy.providers.mfrpc.utils.CicsHeaderUtil;
import org.openlegacy.providers.vsam.properties.VsamProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Orchestration configuration
 */
@Configuration
public class VsamApiConfiguration {

    @Bean(name = "vsamSdkTransporterFactory")
    public MfRpcHttpTransporterFactory mfRpcHttpTransporterFactory(
        VsamProperties vsamProperties,
        CicsHttpRequestCustomizer cicsHttpRequestCustomizer,
        OLDebugProperties debugProperties,
        TracingExecutor tracingExecutor
    ) {
        Map<String, OLCicsProperties.ProjectCicsProperties> projectProperties = vsamProperties.getProject();
        OLCicsProperties.ProjectCicsProperties vsamSdk = projectProperties.get("vsamSdk");
        CicsHeaderUtil vsamCicsHeaderUtil = new CicsHeaderUtil("vsamSdk", vsamSdk);
        return new MfRpcHttpTransporterFactory(
            vsamSdk,
            vsamCicsHeaderUtil,
            new InternalDebugWrapper(debugProperties),
            tracingExecutor,
            cicsHttpRequestCustomizer,
            null
        );
    }
}
