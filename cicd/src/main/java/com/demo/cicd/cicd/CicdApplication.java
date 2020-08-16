package com.demo.cicd.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages ="com.demo.cicd.cicd.dao")
@SpringBootApplication
public class CicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}
	
}
