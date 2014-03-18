package com.examples.service;

import java.util.List;

import com.examples.model.Person;

public interface PersonService {

	public void addUser(Person user);

	public List<Person> getUsersList();
	
}
