package com.training.controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.training.exception.EmployeeNotFoundException;
@ControllerAdvice
public class EmployeeExceptionHandler {

   @ExceptionHandler(value = EmployeeNotFoundException.class)
	   public ModelAndView exception(EmployeeNotFoundException exception) {
	   ModelAndView model=new ModelAndView();
	   model.setViewName("error");
	   model.addObject("errorMsg","Invalid Employee id");
	      return model;
	   }
   

	}

