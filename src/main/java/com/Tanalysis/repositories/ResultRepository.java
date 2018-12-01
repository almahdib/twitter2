package com.Tanalysis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Tanalysis.Classifiers.Result;

@RepositoryRestResource
public interface ResultRepository extends JpaRepository<Result, Long>{

}
