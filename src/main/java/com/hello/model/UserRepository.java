package com.hello.model;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>  {

	public User findByusername(String username);
	
	
}
