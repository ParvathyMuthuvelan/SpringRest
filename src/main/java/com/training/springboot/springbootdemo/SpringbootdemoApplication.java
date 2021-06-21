package com.training.springboot.springbootdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com"})
public class SpringbootdemoApplication {
	private static final Logger LOG = LoggerFactory.getLogger(SpringbootdemoApplication.class);
	public static void main(String[] args) {
		LOG.debug("Logger  initialized");
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

}
