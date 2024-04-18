package com.harsh.tutorial.jpa.jpademo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.harsh.tutorial.jpa.jpademo.entity.User1;
import com.harsh.tutorial.jpa.jpademo.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	public static final Logger log = 
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User1 user = new User1("Jack","Admin");
		userRepository.save(user);
		log.info("New User is created : " + user);
		Optional<User1> userWithId = userRepository.findById(1L);
		log.info("User with Id" + userWithId);
		List<User1> users = userRepository.findAll();
		log.info("All users: "+users);
		
	}

}
