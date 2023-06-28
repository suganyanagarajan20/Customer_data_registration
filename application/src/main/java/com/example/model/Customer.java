package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private int id;
	private String first_name;
	private String last_name;
	private String gender;
	private String email;
	
	//1st variable
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//2nd variable
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	//3rd variable
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	//4th variable
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	//5th variable
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}

}
