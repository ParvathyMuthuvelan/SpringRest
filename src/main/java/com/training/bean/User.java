package com.training.bean;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Currency;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

public class User {

	
	
	
	//@NotEmpty(message = "{user.name.empty}")
	//@Length(min = 1, max = 3,message = "{user.name.invalid}")
	@NotEmpty(message="Name is required")
	private String name;
	
	//@CreditCardNumber
//@Currency("EUR")


	//@NotNull(message="{user.age.empty}")
	//@Range(min = 0, max = 100)
	@NotNull(message="Age is required")
	@Min(18)
	private Integer age;
	private String gender;
public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	//	@NotNull
//    private Date dateOfBirth;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

//	public Date getDateOfBirth() {
//		return dateOfBirth;
//	}
//
//	public void setDateOfBirth(Date dateOfBirth) {
//		this.dateOfBirth = dateOfBirth;
//	}

	
}