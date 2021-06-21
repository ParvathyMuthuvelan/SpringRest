package com.training.springboot.springbootdemo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.training.controller.PersonController;
//@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootdemoApplicationTests {
	@Autowired 
	private PersonController personController; 

	@Test
	void contextLoads() {
		assertNotNull(personController); 
	}
	

}
