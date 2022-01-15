package com.project.collegequora.controllers;

import java.util.List;

import com.project.collegequora.models.Department;
import com.project.collegequora.models.Subject;
import com.project.collegequora.repository.DepartmentRepository;
import com.project.collegequora.repository.SubjectRepository;
import com.project.collegequora.response.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin

@RestController
@RequestMapping("/web")
public class adminController {


    @Autowired
    SubjectRepository subjectRepository;
    
    @Autowired
    DepartmentRepository departmentRepository;
    

    @PostMapping("/addsub")
    public Response addsubject(@RequestBody Subject subject){
        if(subjectRepository.count()>0){
            List<Subject>  data =subjectRepository.findAll();
            for(Subject sub:data){
                if(sub.getSubId().equals(subject.getSubId())){
                    return new Response(400,"already exits",sub);
                }
            }
        }
        subjectRepository.save(subject);
        return new Response(200,"saved sucessful",subject);

    }

    @PostMapping("/addDept")
public Response addDepartment(@RequestBody Department department)
{
if(departmentRepository.count()>0){
List<Department> data = departmentRepository.findAll();
for(Department dept: data){
if(dept.getDeptId().equals(department.getDeptId())){
return new Response(400,"Department Id Already exists",dept);
}
}
} 
departmentRepository.save(department);
return new Response(200,"Department saved Successfully", "");
}

@GetMapping("/findDepartments")
public Response findUser()
{
List<Department> dept=departmentRepository.findAll();
return new Response(200,"Fetched successfully", dept);
}

    
}
