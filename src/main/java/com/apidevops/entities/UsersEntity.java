package com.apidevops.entities;

import org.springframework.data.annotation.Id;

public class UsersEntity {

	@Id
	private String id;

	private String username;

	private String firstName;

	private String lastName;

	private String email;

	private String entry;

	public UsersEntity() {
	}

	public UsersEntity(String id, String username, String firstName, String lastName, String email, String entry) {
		super();
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.entry = entry;
	}
	
	

}
