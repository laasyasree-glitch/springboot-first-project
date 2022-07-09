package com.springbootproject.firstspringbootproject.jpa;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springbootproject.firstspringbootproject.Survey;

@RepositoryRestResource(path = "users", collectionResourceRel = "users")
public interface RestSurveyRepository extends
		PagingAndSortingRepository<Survey, Long> {
<<<<<<< HEAD
	List<Survey> findById(@Param("id") String role);
}
=======
	List<Survey> findByRole(@Param("role") String role);
}
>>>>>>> 5f5578452f48ff02c533efa265035ab84027c0af
