package com.training.springrestapi.SpringRest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springrestapi.SpringRest.model.Message;

@RestController
@RequestMapping("/api")
public class WelcomeController {
	@GetMapping("/welcome")
	public String showTextMessage()
	{
		return "Welcome to Spring Rest API";
	}
	@GetMapping("/message")
	public Message showObjectMessage()
	{
		return new Message(1,"Welcome to Spring Rest API");
	}
	@PostMapping("/createMessage")
	public Message createMessage(@RequestBody Message msg)
	{
		msg.setMessage(msg.getMessage()+ " received and modified in the api");
		return msg;
	}
}
