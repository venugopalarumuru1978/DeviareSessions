package com.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_adrs_2")
public class Employee2 {

	@Id
	private int empno;
	private String ename;
	private String job;
	private float salary;
	
	@OneToOne(targetEntity = Address2.class, cascade = CascadeType.ALL)
	@JoinColumn(name="adrsid")
	private Address2 adrs;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Address2 getAdrs() {
		return adrs;
	}

	public void setAdrs(Address2 adrs) {
		this.adrs = adrs;
	}
	
}
