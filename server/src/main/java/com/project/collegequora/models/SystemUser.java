package com.project.collegequora.models;

import org.springframework.data.annotation.Id;


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

public class SystemUser  {
    @Id
	private String userId;

	private String name;
	private String email;
	private String password;	
	private String roles;
	private Boolean isActive;
	private String deptId;
	private String roleId;
	
    
}
