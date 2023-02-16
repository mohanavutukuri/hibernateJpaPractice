package com.stdmanagement.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="subject")
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "sub_id")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int sub_id;
	String name;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy ="sublist",fetch = FetchType.LAZY)
	List<Student> stdlist=new ArrayList<>();
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStdlist() {
		return stdlist;
	}
	public void setStdlist(List<Student> stdlist) {
		this.stdlist = stdlist;
	}
	public Subject(int sub_id, String name, List<Student> stdlist) {
		super();
		this.sub_id = sub_id;
		this.name = name;
		this.stdlist = stdlist;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Subject [sub_id=" + sub_id + ", name=" + name + ", stdlist=" + stdlist + "]";
	}
	
	
}
