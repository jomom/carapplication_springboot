package com.packt.cardatabse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardatabseApplication {

	private static final Logger logger = LoggerFactory.getLogger(CardatabseApplication.class);

	public static void main(String[] args) {
		//Added this line of comment
		SpringApplication.run(CardatabseApplication.class, args);
		logger.info("Application started");

	}

}
