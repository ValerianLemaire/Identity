package com.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.model.Identity;
import com.application.repository.IdentityRepository;

@Service
public class IdentityService {

	@Autowired
	private IdentityRepository identityRepository;
	
	public void save(Identity identity) {
		this.identityRepository.save(identity);
	}
	
}
