package com.stdmanagement;

import com.stdmanagement.Entity.Address;
import com.stdmanagement.Entity.Gaurdian;
import com.stdmanagement.Entity.Student;
import com.stdmanagement.Entity.Subject;
import com.stdmanagement.Service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class HibernateJpaPracticeApplicationTests {

	@Autowired
	private StudentService service;
	@Test
	void contextLoads() {
		Student std=new Student();
		std.setName("snehi");
		std.setPhone(9146451089l);
		Address add=new Address();
		add.setDoorno("31");
		add.setStreet("reg");
		add.setCity("cca");
		add.setDist("ggat");
		add.setState("kaka");
		std.setAddress(add);
		Gaurdian grd=new Gaurdian();
		grd.setName("cha");
		grd.setPhone(838734874l);
		std.setGuardian(grd);
		List<Subject> subjects=new ArrayList<>();
		Subject sub1=new Subject();
		sub1.setName("sub1");
		Subject sub2=new Subject();
		sub2.setName("sub2");
		subjects.add(sub1);
		subjects.add(sub2);
		std.setSublist(subjects);
		System.out.println(service.addNewStd(std));
	}

}
