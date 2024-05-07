package com.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="PrjEmpInfo")
public class Projects {

	@Id
	private int prjId;
	private String prjName;

	@ManyToMany(targetEntity=Employee.class, cascade=CascadeType.ALL)
	private List<Employee>  empinfo;

	public int getPrjId() {
		return prjId;
	}

	public void setPrjId(int prjId) {
		this.prjId = prjId;
	}

	public String getPrjName() {
		return prjName;
	}

	public void setPrjName(String prjName) {
		this.prjName = prjName;
	}

	public List<Employee> getEmpinfo() {
		return empinfo;
	}

	public void setEmpinfo(List<Employee> empinfo) {
		this.empinfo = empinfo;
	}
	
	
}
