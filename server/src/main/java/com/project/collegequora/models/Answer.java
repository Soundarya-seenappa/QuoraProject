package com.project.collegequora.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
 
@Getter
@Setter
@Data
@AllArgsConstructor
@ToString

@Document(collection="Answer")
public class Answer {
 @Id
 private String ansId;
 private String answer;
 private Date ansDate;
 private String userId;
 private String quesId;
 
}
