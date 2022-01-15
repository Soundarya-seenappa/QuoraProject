package com.project.collegequora.repository;

import com.project.collegequora.models.SystemUser;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SystemUserRepository extends MongoRepository<SystemUser, String>{
	public SystemUser findByEmail(String email);

    public boolean existsByEmail(String email);
}
    

