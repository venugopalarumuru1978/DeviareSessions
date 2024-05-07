package com.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_Bank")
public class Customer {

	@Id
	private int cusid;
	private String cusname;
	private String location;
	
	@OneToMany(targetEntity = BankAccount.class, cascade = CascadeType.ALL)
	@JoinColumn(name="cusid")
	private List<BankAccount>  accinfo;
	
	public int getCusid() {
		return cusid;
	}

	public void setCusid(int cusid) {
		this.cusid = cusid;
	}

	public String getCusname() {
		return cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<BankAccount> getAccinfo() {
		return accinfo;
	}

	public void setAccinfo(List<BankAccount> accinfo) {
		this.accinfo = accinfo;
	}

	
}
