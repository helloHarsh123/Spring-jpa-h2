package com.harsh.tutorial.jpa.jpademo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.tutorial.jpa.jpademo.entity.User1;

public interface UserRepository extends JpaRepository< User1 , Long>{

}
