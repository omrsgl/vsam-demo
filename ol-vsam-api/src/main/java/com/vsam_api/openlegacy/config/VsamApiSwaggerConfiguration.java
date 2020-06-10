package com.vsam_api.openlegacy.config;

import org.openlegacy.swagger.models.SwaggerDocketConfig;
import org.openlegacy.swagger.utils.OLSwaggerDocketUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;import springfox.documentation.service.Tag;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Swagger configuration
 */
@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class VsamApiSwaggerConfiguration {

    @Bean
    public Docket swaggerDocket() {
        Docket config = OLSwaggerDocketUtils.createSwaggerDocket(SwaggerDocketConfig.builder()
            .title("OpenLegacy VSAM API")
            .version("1.0.0")
            .contactName("OpenLegacy")
            .contactUrl("http://OpenLegacy.com")
            .build())
            .tags(new Tag("Data Source Connector API", "Endpoints to implement"));
        config
            .select()
            .paths(regex(".*/objects.*|/objects.*|/api/.*"))
            .build();
        return config;
    }

}

