package com.techoffice.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Appl {

	public static void main(String[] args) {
		SpringApplication.run(Appl.class, args);
	}

}
