package com.java.exception.assignment8;

public class PasswordException extends RuntimeException{
	
	String msg;
	
	public PasswordException(String msg) {
		// TODO Auto-generated constructor stub
		
		super(msg);
	}

}