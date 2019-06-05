package com.apidevops.service;

import java.util.List;

import com.apidevops.entities.UsersEntity;

public interface UsersService {
	
	List<UsersEntity> findAll() throws Exception;

}
