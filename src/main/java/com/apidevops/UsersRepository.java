package com.apidevops;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.apidevops.entities.UsersEntity;


@Repository
public interface UsersRepository extends MongoRepository<UsersEntity, String> {
	
	UsersEntity findByFirstName(String username);

	List<UsersEntity> findByLastName(String lastName);

}
