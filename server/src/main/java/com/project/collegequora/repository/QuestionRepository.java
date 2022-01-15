package com.project.collegequora.repository;

import java.util.List;

import com.project.collegequora.models.Question;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository <Question,String>{

   List<Question> findAllBySubId(String subId);

   List<Question> findByquesId(String quesId);
    
}
