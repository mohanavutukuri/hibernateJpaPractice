package com.stdmanagement.Entity;

import javax.persistence.*;

@Entity
@Table(name="gaurdian")
public class Gaurdian {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	Long phone;
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
	public Gaurdian(int id, String name, Long phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	public Gaurdian() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Gaurdian [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
}
