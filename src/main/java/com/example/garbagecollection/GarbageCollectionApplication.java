package com.example.garbagecollection;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GarbageCollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarbageCollectionApplication.class, args);
	}

}
