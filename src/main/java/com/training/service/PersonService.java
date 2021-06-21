package com.training.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.restservice.Person;
import com.training.exception.InvalidIdException;

@Service
public class PersonService {
	private static Map<Integer, Person> personRepo = new HashMap<>();
	private static final Logger LOG = LoggerFactory.getLogger(PersonService.class);
	public void remove(int id) {
		personRepo.remove(id);

	}

	public void put(int id, Person person) {
		personRepo.put(id, person);

	}

	public List<Person> getAll() {
		List<Person> personList = new ArrayList<>();
		for (Entry<Integer, Person> entry : personRepo.entrySet()) {
			personList.add(entry.getValue());
		}
		return personList;
	}

	public Person findById(int id) throws InvalidIdException {
		Person person = personRepo.get(id);
		LOG.debug("Service initialized");
		if(person==null)
			throw new InvalidIdException();
		return person;
	}

}
