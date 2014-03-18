package com.examples.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;

import com.examples.dao.UserDAO;
import com.examples.model.Person;

@Repository
public class JPAUserDAO implements UserDAO {

	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager entityManager;
	
	@Override
	public void addUser(Person user){
		entityManager.persist(user);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Person> getAll() {
		List<Person> list ;
		try {
			list = entityManager.createQuery("FROM Person").getResultList();
			return list;
		} catch (NoResultException e) {
			return null;
		}
	}
}
