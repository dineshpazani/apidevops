package com.apidevops.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apidevops.UsersRepository;
import com.apidevops.entities.UsersEntity;
import com.apidevops.service.UsersService;


@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	UsersRepository usersRepository;
	
	@Override
	public List<UsersEntity> findAll() throws Exception {
		return usersRepository.findAll();
	}

}
