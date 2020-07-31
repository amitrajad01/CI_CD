package com.demo.cicd.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}
	@GetMapping("/message")
	public String message() {
		return "CI/CD";
	}
}