package com.training.service;

import org.springframework.stereotype.Service;

import com.training.bean.LoginBean;

@Service
public class LoginService {
public boolean validate(LoginBean bean)	{
		
		return bean.getUserName().equals(bean.getPassword());
	}
}
