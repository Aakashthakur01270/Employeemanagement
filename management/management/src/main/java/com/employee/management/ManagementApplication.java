package com.employee.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManagementApplication {

	public static void main(String[] args) {
		System.out.println("Hi Management");
		SpringApplication.run(ManagementApplication.class, args);
	}

}
