package com.stdmanagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.stdmanagement.Entity.Student;
import com.stdmanagement.Service.StudentService;

import java.util.List;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping("/addstudent")
	Student addstudent(@RequestBody Student std) {
		return service.addNewStd(std);
	}
	@GetMapping("/allstudents")
	public List<Student> allStudents(){
		return service.getAllStudents();
	}

	@GetMapping("/studentbyid/{id}")
	public Student studentById(@PathVariable int id){
		return service.studentbyId(id);
	}

	@PutMapping("/updatestudent")
	public Student updateStudent(@RequestBody Student std){
		return service.updateStudent(std);
	}

	@DeleteMapping("/deletestudent/{id}")
	public String DeleteString(@PathVariable int id){
		return service.DeleteStudent(id);
	}
}
