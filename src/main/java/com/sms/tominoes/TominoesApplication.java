package com.sms.tominoes;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sms.tominoes.Category.CategoryRepository;
import com.sms.tominoes.Category.CategoryService;
import com.sms.tominoes.Crust.CrustService;
import com.sms.tominoes.Toppings.ToppingsService;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableSwagger2
public class TominoesApplication {


	public static void main(String[] args) {
		SpringApplication.run(TominoesApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		//Return a prepared docket instance
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.sms.tominoes"))
				.build()
				.apiInfo(getApiInfo());

	}

	public ApiInfo getApiInfo() {
		return new ApiInfo(
				"Tominoes App API"
				, "Ordering app for pizza app"
				, "1.0"
				, "Free to Use"
				, new springfox.documentation.service.Contact("Mohit Nirwan", "https://persistentsystems.sharepoint.com/sites/Pi/SitePages/Person.aspx"
				, "mohit_nirwan@persistent.co.in")
				, "API LICENSE"
				, "http://google.com"
				,Collections.emptyList());
	}

}
