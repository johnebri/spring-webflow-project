package com.test.webflow.service;

import org.springframework.stereotype.Service;

import com.test.webflow.bean.LoginPojoBean;

@Service
public class LoginService {
	
	public String authenticateUser(LoginPojoBean loginBean) {
		
		String userName = loginBean.getuName();
		String password = loginBean.getPword();
		
		if(userName.equals("john") && password.equals("123456")) {
			return "true";
		} else {
			return "false";
		}
	}

}
