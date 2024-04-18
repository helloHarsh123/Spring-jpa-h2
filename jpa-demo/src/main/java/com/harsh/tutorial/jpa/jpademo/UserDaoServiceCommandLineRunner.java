package com.harsh.tutorial.jpa.jpademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.harsh.tutorial.jpa.jpademo.entity.User1;
import com.harsh.tutorial.jpa.jpademo.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	public static final Logger log = 
			LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User1 user = new User1("Jill","Admin");
		long insert = userDaoService.insert(user);
		log.info("New User is created : " + user);
	}

}
