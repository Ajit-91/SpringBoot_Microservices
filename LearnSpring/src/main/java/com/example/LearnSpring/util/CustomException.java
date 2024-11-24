package com.example.LearnSpring.util;

public class CustomException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int status;	
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


	public CustomException(int status, String message) {
		super(message);
		this.status = status;
	}
	
}
