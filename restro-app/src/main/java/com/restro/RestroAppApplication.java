package com.restro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.transaction.Transactional;

@SpringBootApplication

public class RestroAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestroAppApplication.class, args);
	}

}