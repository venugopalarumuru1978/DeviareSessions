package com.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="adrs_emp_2")
public class Address2 {

	@Id
	private int adrsid;
	
	private String adrsinfo;
	private String location;
	
	@OneToOne(targetEntity = Employee2.class, cascade = CascadeType.ALL)
	@JoinColumn(name="empno")
	private Employee2 emp;
	
	public Employee2 getEmp() {
		return emp;
	}
	public void setEmp(Employee2 emp) {
		this.emp = emp;
	}
	public int getAdrsid() {
		return adrsid;
	}
	public void setAdrsid(int adrsid) {
		this.adrsid = adrsid;
	}
	public String getAdrsinfo() {
		return adrsinfo;
	}
	public void setAdrsinfo(String adrsinfo) {
		this.adrsinfo = adrsinfo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
