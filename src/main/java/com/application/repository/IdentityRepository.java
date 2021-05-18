package com.application.repository;

import org.springframework.stereotype.Repository;

import com.application.model.Identity;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface IdentityRepository extends CrudRepository<Identity, Long> {
	
}
