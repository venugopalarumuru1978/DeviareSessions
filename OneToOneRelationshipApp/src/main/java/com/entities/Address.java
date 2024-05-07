package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="adrs_emp")
public class Address {

	@Id
	private int adrsid;
	
	private String adrsinfo;
	private String location;
	
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
