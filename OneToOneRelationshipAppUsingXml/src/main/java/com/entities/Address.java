package com.entities;


public class Address {

	private int adrsid;
	
	private String adrsinfo;
	private String location;
	
	private Employee emp;
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
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
