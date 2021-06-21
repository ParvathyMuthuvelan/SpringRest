package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.bean.LoginBean;
import com.training.service.LoginService;

@Controller
public class LoginController {
	
	@ModelAttribute("login")
	public LoginBean loginBean()
	{
	    return new LoginBean();
	}
	
	@Autowired
	private LoginService service;

    @RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginpage(@ModelAttribute("login") LoginBean login) {
	    
			return "login";

	}
    @RequestMapping(value="/submitlogin", method=RequestMethod.POST)
    public String checkLoginDetails(@ModelAttribute("user") LoginBean login) 
    	{
    	String result="";
    	if(service.validate(login))
    		result="success";
    	return result;
    	
    }
	
//	  @RequestMapping(value="/showLogin", method=RequestMethod.GET)
//		public String displayLoginpage(@ModelAttribute("user") LoginBean login) {
//		    
//				return "LoginPage";
//
//		}

//	@RequestMapping(value="/loginValidate", method=RequestMethod.POST)
//	public String checkLoginDetails(@ModelAttribute("user") LoginBean login) {
//		
//	    if(service.validate(login))
//	    {
//	        return "success";
//	    }
//	    else
//	    {
//	        return "invalid";
//	    }
//
//	}
}
