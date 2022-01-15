package com.project.collegequora.repository;

import com.project.collegequora.models.Answer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnswerRepository extends MongoRepository<Answer, String>{

    Answer findByQuesId(String quesId);
       
    

    
}
