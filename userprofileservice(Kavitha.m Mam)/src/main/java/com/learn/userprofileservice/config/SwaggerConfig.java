package com.learn.userprofileservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiDocumentation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.regex("/api/v1/.*"))
                .apis(RequestHandlerSelectors.basePackage("com.learn.userprofileservice.controller"))
                .build()
                .apiInfo(apiMetadata());
    }

    public ApiInfo apiMetadata(){
        return new ApiInfoBuilder()
                .title("My contacts API")
                .build();
    }
}
