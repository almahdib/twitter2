package com.Tanalysis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


import com.Tanalysis.entities.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long>{
	public User findOneByUsername(String username);

}
