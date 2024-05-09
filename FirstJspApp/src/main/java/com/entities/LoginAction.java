package com.entities;

public class LoginAction {

	private String uname, pswd;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
		System.out.println("Uname called");
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
		System.out.println("Password called");
	}
	
	
}
