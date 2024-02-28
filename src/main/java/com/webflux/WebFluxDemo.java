package com.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories(basePackages = "com.webflux")
public class WebFluxDemo {
	public static void main(String[] args) {
		SpringApplication.run(WebFluxDemo.class, args);
	}

}
