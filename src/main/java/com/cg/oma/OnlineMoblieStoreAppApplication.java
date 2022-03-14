package com.cg.oma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Order API", version = "2.0", description = "Order Information for Customers"))
public class OnlineMoblieStoreAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineMoblieStoreAppApplication.class, args);
	}

}
