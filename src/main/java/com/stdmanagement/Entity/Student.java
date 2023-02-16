package com.stdmanagement.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.DynamicUpdate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="student")
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "id")
@DynamicUpdate
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	Long phone;
	@OneToOne(cascade = CascadeType.ALL)
	Address address;
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name = "students_subjects",joinColumns = @JoinColumn(name = "id"),inverseJoinColumns = @JoinColumn(name="sub_id"))
	List<Subject> sublist=new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	Gaurdian guardian;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Subject> getSublist() {
		return sublist;
	}

	public void setSublist(List<Subject> sublist) {
		this.sublist = sublist;
	}

	public Gaurdian getGuardian() {
		return guardian;
	}

	public void setGuardian(Gaurdian guardian) {
		this.guardian = guardian;
	}

	public Student(int id, String name, Long phone, Address address, List<Subject> sublist, Gaurdian guardian) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.sublist = sublist;
		this.guardian = guardian;
	}
	
	public Student(int id, String name, Long phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", sublist="
				+ sublist + ", guardian=" + guardian + "]";
	}
	
	
}
