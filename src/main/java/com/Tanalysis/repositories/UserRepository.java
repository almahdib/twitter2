package com.Tanalysis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Tanalysis.entities.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long>{

}
