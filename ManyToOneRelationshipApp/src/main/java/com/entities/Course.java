package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CourseRef")
public class Course {

	@Id
	private int curid;
	
	private String curname;
	private int duration;
	private float fees;
	
	public int getCurid() {
		return curid;
	}
	public void setCurid(int curid) {
		this.curid = curid;
	}
	public String getCurname() {
		return curname;
	}
	public void setCurname(String curname) {
		this.curname = curname;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
}
