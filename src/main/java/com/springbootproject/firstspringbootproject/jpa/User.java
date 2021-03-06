package com.springbootproject.firstspringbootproject.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//Table
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
<<<<<<< HEAD
	private int id;
=======
	private Long id;
>>>>>>> 5f5578452f48ff02c533efa265035ab84027c0af
	
	private String userName;
	private String role;
	private String password;
	
	protected User() {
		//Expects private empty no argument constructor
	}
	
	public User(int id, String userName, String role, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.role = role;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + userName + ", role=" + role + ", password=" + password + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return userName;
	}
	public String getRole() {
		return role;
	}
	public String getPassword() {
		return password;
	}
	
}