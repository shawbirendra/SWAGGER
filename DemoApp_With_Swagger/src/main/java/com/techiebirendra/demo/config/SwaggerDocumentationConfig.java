package com.techiebirendra.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Component
@Configuration
@EnableSwagger2
public class SwaggerDocumentationConfig {

	ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Spring Demo Application With Swagger. ").description(
				"This is a Demo Application which will show you to work with your rest API by integrating with Swagger UI.")
				.license("Apache 2.0").licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.termsOfServiceUrl("").version("1.0.0").contact(new Contact("Techie Birendra", "https://www.youtube.com/channel/UCrVKhcHEQESmKtK5GEKKwng", "krs.birendra@gmail.com")).build();
	}

	@Bean
	public Docket customImplementation() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.techiebirendra.demo")).build().apiInfo(apiInfo());
	}

}
