package com.springswaggerdemo.config;


import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Confic {
	@Bean
	public Docket swaggerconfig() {
		 return new Docket(DocumentationType.SWAGGER_2)
				 .select()
				 .paths(PathSelectors.ant("/api/*"))
				 .build()
				 .apiInfo(new ApiInfo("movies api", "movies management api description", 
						 "1.0", "http://springswagger.com/termsofuse",
						 new Contact("name", "url","info@springswaggwe.com"),
						 "opensource"," http://springswagger.com/license", 
						 Collections.emptyList()));
		 
		
	}

}
