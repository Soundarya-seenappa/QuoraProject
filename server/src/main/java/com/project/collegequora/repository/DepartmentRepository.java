package com.project.collegequora.repository;

import com.project.collegequora.models.Department;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department, String>{

}
    

