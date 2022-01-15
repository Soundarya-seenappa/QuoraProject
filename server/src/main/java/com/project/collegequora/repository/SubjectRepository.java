package com.project.collegequora.repository;

import java.util.List;

import com.project.collegequora.models.Subject;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface SubjectRepository  extends MongoRepository<Subject, String>{
    List<Subject> findAllByDeptId(String deptId);
    
}
