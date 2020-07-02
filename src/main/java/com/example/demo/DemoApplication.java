package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BldgRepository repository) {
		return (args) -> {
			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Bldg customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Bldg customer = repository.findById(4L);
			log.info("Customer found with findById(4L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");
		};
	}
}
