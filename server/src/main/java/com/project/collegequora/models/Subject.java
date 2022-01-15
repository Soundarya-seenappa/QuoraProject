package com.project.collegequora.models;

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

@Document(collection="Subject")
public class Subject {
 
 @Id
 private String subId;
 private String subName;
 private String deptId;
}
