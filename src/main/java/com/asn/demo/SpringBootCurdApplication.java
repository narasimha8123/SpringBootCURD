package com.asn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//@EnableAutoConfiguration(exclude = {com.asn.demo.controllers.EmployeeController.class})
public class SpringBootCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCurdApplication.class, args);
	}

}
