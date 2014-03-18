package com.examples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examples.dao.UserDAO;
import com.examples.model.Person;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void addUser(Person user) {
		userDAO.addUser(user);
	}

	@Override
	public List<Person> getUsersList() {
		return userDAO.getAll();
	}

}
