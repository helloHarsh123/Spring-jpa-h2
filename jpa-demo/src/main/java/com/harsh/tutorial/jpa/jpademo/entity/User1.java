package com.harsh.tutorial.jpa.jpademo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// Table user Mapping 
@Entity
public class User1 {
	
	@Id // primary key
	@GeneratedValue // generate while storing 
	private long id;
	private String name;
	private String role;
	
	protected User1() {
		
	}
	public User1(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
}
