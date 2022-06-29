package com.springbootproject.firstspringbootproject.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository<User,Long>{
	 List<User> findByRole(String description);
	
}
