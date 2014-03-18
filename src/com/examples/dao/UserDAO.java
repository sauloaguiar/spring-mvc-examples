package com.examples.dao;

import java.util.List;

import com.examples.model.Person;

public interface UserDAO {

	public void addUser(Person user);

	public List<Person> getAll();

}