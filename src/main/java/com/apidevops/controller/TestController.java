package com.apidevops.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apidevops.entities.UsersEntity;

@RestController
public class TestController {
	
	@RequestMapping(value = "/{test}", method = RequestMethod.GET)
	public String test() {
		return "test";
	}
	
}
