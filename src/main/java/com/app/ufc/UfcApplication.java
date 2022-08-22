package com.app.ufc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class UfcApplication {

	public static void main(String[] args) {
		SpringApplication.run(UfcApplication.class, args);
	}

}
