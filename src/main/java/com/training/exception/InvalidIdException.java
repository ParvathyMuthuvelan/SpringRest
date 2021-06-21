package com.training.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND,reason="Invalid Person Id")
public class InvalidIdException extends Exception{
//public InvalidIdException(String message)
//{
//	super(message);
//	}
}
