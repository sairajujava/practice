package com.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	 @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select().apis(RequestHandlerSelectors.basePackage("com"))
	                .paths(PathSelectors.regex("/*.*"))
	                .build()
	                .apiInfo(metaData())
	                .securitySchemes(Arrays.asList(apiKey()));
	    }

	    private ApiInfo metaData() {
	        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
	         return apiInfoBuilder.title("Employee Management REST API")
	                .description("Spring Boot REST API for ServiceProvider")
	                .version("1.0")
	                .termsOfServiceUrl("Terms of service")
	                .contact(new Contact("JavaCampus", "https://www.javacampus.com/", ""))
	                .license("Apache License Version 2.0")
	                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
	                .build();
	    }

	    private ApiKey apiKey() {
	        return new ApiKey("authToken", "Authorization", "header");
	    }

}
