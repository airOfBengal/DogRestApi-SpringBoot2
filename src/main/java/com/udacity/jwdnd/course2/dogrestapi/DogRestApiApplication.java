package com.udacity.jwdnd.course2.dogrestapi;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DogRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogRestApiApplication.class, args);
	}

}
