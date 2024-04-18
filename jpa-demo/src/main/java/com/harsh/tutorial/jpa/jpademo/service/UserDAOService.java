package com.harsh.tutorial.jpa.jpademo.service;

import org.springframework.stereotype.Repository;

import com.harsh.tutorial.jpa.jpademo.entity.User1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User1 user) {
		entityManager.persist(user); // User is now inside persistence context, its changes are being tracked. 
		return user.getId();
	}
}
