package com.intent.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.intent"})
@EnableJpaRepositories
public class SpringBootWithH2databaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithH2databaseApplication.class, args);
	}

}
