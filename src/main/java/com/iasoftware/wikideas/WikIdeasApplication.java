package com.iasoftware.wikideas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.iasoftware.wikideas.repository")
public class WikIdeasApplication {

	public static void main(String[] args) {
		SpringApplication.run(WikIdeasApplication.class, args);
	}

}
