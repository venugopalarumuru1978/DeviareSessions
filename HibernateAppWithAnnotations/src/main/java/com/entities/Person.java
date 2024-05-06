package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PersonInfo")
public class Person {

	@Id // primary key  
	@GeneratedValue  // auto generated values 
	@Column(name="person_id")
	private int pid;
	
	@Column(name="person_name")
	private String pname;
	
	@Column(name="person_phone")
	private String phone;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
