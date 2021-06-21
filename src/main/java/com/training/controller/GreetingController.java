package com.training.controller;


import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.Greeting;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private static final Logger LOG = LoggerFactory.getLogger(GreetingController.class);
	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		//return new Greeting(counter.incrementAndGet(), String.format(template, name));
		LOG.info("Logger initialized in controller");
		return "Hello";
	}
}
//https://spring.io/guides/gs/rest-service/
//https://www.springboottutorial.com/unit-testing-for-spring-boot-rest-services