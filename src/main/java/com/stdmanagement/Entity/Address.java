package com.stdmanagement.Entity;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String doorno;
	String street;
	String city;
	String dist;
	String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(int id, String doorno, String street, String city, String dist, String state) {
		super();
		this.id = id;
		this.doorno = doorno;
		this.street = street;
		this.city = city;
		this.dist = dist;
		this.state = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", doorno=" + doorno + ", street=" + street + ", city=" + city + ", dist=" + dist
				+ ", state=" + state +  "]";
	}
	
	
}
