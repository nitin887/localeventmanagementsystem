package com.localeventmanagementsysytem.localeventmanagementsystem;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Local Event Management System API", version = "1.0", description = "API documentation for the Local Event Management System"))
public class LocaleventmanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocaleventmanagementsystemApplication.class, args);
	}

}
