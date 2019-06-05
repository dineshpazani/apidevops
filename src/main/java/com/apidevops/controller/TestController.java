package com.apidevops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apidevops.entities.UsersEntity;
import com.apidevops.service.UsersService;

@RestController
public class TestController {
	
	@Autowired
	UsersService usersService;
	
	/*
	 * @RequestMapping(value = "/{test}", method = RequestMethod.GET) public String
	 * test() { return "test"; }
	 */
	
	@RequestMapping(value = "/{users}", method = RequestMethod.GET)
	public List<UsersEntity> getAllUsers() throws Exception {
		//return usersService.findAll();
		return null;
	}
	
}
