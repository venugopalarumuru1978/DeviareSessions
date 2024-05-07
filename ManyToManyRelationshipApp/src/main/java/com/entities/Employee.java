package com.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name="EmpPrjInfo")
public class Employee {

	@Id
	private int empno;
	private String ename;
	
	@ManyToMany(targetEntity=Projects.class, cascade=CascadeType.ALL)
	
	@JoinTable(name="emps_prjs_info", 
	joinColumns= {@JoinColumn(name="empno")},
	inverseJoinColumns= {@JoinColumn(name="prjid")})
	
	private List<Projects>  prjinfo;
	

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

	public List<Projects> getPrjinfo() {
		return prjinfo;
	}

	public void setPrjinfo(List<Projects> prjinfo) {
		this.prjinfo = prjinfo;
	}
	
	
}
