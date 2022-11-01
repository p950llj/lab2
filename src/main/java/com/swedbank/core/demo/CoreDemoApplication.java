package com.swedbank.core.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@OpenAPIDefinition(
		info = @io.swagger.v3.oas.annotations.info.Info(
				title = "Enter a title for your application",
				version = "1.0",
				description = "Enter a description for your application"
		)
)
@SpringBootApplication(scanBasePackageClasses = {CoreDemoApplication.class},
		scanBasePackages = {"com.swedbank.andromeda.spacetime"}) //Needed for the application to find the spacetime libraries Spring components
public class CoreDemoApplication {
	public static void main(String[] args) {
		io.swagger.v3.core.jackson.ModelResolver.enumsAsRef = true;
		SpringApplication.run(CoreDemoApplication.class, args);
	}
}
