package com.jay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfiguration {
	ApiInfo apiInfo()
	{
		return new ApiInfoBuilder()
				.title("customer services")
				.description("This service provide nothing thanks")
				.license("jay shah")
				.termsOfServiceUrl("https://spring.io/")
				.version("0.0.1")
				.contact(new Contact("jay shah","https://spring.io/" ,"jay.k.shah555@gmail.com"))
				.build();
	}
	
	@Bean
	public Docket customImplementation() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("customer services")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.jay"))
				.build()
				.apiInfo(apiInfo());
		
	}

}
