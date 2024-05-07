package com.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="StdRef")
public class Student {

	@Id
	private int rollno;
	private String sname;
	
	@ManyToOne(targetEntity = Course.class, cascade = CascadeType.ALL)
	@JoinColumn(name="curid")
	private Course curs;
	
	public Course getCurs() {
		return curs;
	}
	public void setCurs(Course curs) {
		this.curs = curs;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
}
