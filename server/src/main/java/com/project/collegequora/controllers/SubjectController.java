package com.project.collegequora.controllers;


import com.project.collegequora.models.Answer;
import com.project.collegequora.models.Question;
import com.project.collegequora.repository.AnswerRepository;
import com.project.collegequora.repository.QuestionRepository;
import com.project.collegequora.repository.SubjectRepository;
import com.project.collegequora.response.Response;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin

@RestController
public class SubjectController {

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswerRepository answerRepository;

   
@PostMapping("/postquestion")
    public void createquestion(@RequestBody Question question){
        questionRepository.save(question);
        
}

    @GetMapping("/getquestion/{subId}")
    public Response getallques(@PathVariable String subId) {
        return new Response(200,"question fetched",questionRepository.findAllBySubId(subId));
        
    }

    @GetMapping("/answer/{quesId}")
    public Response getanswer(@PathVariable String quesId){
        return new Response(200,"Answer fetched",answerRepository.findByQuesId(quesId));
    }




    @PostMapping("/postanswer/{quesId}")
    public void createanswer(@RequestBody Answer answer){
        answerRepository.save(answer);
        
}
  

   
   
    /*@PutMapping("/questions/{quesId}")
    public Question updateQuestion(@PathVariable String quesId,
                                   @Validated @RequestBody Question questionRequest) {
        return questionRepository.findByquesId(quesId)
                .map( question -> {
                    question.setDescription(questionRequest.getquestion());
                    return questionRepository.save(question);
                }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + quesId));
                }*/
/* @PostMapping("/postquestion")
    public Question createquestion(@RequestBody Question question){
        try {
        questionRepository.save(question);
        return question;
    }catch(Exception ex) {
        System.out.println(ex);
        return null;
    }
}*/
    }
    

    

