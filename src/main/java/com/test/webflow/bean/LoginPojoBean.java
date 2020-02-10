package com.test.webflow.bean;

import java.io.Serializable;

public class LoginPojoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String uName;
	private String pword;
	
	public String getuName() {
		return uName;
	}
	
	public void setuName(String uName) {
		this.uName = uName;
	}
	
	public String getPword() {
		return pword;
	}
	
	public void setPword(String pword) {
		this.pword = pword;
	}

	@Override
	public String toString() {
		return "LoginPojoBean [uName=" + uName + ", pword=" + pword + "]";
	}	
	
	

}
