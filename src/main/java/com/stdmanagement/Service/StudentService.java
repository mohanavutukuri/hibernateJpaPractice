package com.stdmanagement.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stdmanagement.Entity.Student;
import com.stdmanagement.Repo.StudentRepo;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
	@Autowired
	StudentRepo repo;
	
	
	public Student addNewStd(Student std) {
		Student std1=new Student();
		std1.setName(std.getName());
		std1.setPhone(std.getPhone());
		std1.setGuardian(std.getGuardian());
		std1.setAddress(std.getAddress());
		std1.setSublist(std.getSublist());
		return repo.save(std1);
	}
	public List<Student> getAllStudents(){
		return repo.findAll();
	}

	public Student studentbyId(int id){
		return repo.findById(id).orElse(null);
	}

	public Student updateStudent(Student student){
		Student std=repo.findById(student.getId()).orElseThrow(null);
		std.setName(student.getName());
		std.setPhone(student.getPhone());
		return repo.save(std);
	}

	public String DeleteStudent(int id){
		Optional<Student> std=repo.findById(id);
		if(std.isPresent()){
			repo.deleteById(id);
			return "student removed successfully";
		}
		return "unable to delete";
	}
}
