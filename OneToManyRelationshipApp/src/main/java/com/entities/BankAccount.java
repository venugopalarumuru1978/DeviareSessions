package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Bank_Customer")
public class BankAccount {

	@Id
	private int baid;
	private String accno;
	private String bankname;

	public int getBaid() {
		return baid;
	}
	public void setBaid(int baid) {
		this.baid = baid;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
}
