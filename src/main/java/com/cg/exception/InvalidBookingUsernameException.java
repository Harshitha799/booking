package com.cg.exception;

/***********************************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is the implementation class of InvalidBookingUsernameException
 * Created date: 24-04-2021
 * 
 ************************************************************************************/

public class InvalidBookingUsernameException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -397062827051951364L;

	
	/**************************************
	 * 
	 * @author Harshitha V
	 * Created date: 21-04-2021
	 * This is a no-arg constructor
	 * 
	 **************************************/
	
	public InvalidBookingUsernameException() {
		super();
	}

	/****************************************
	 * 
	 * @author Harshitha V
	 * Created date: 21-04-2021
	 * @param message
	 * This is a parameterized constructor
	 * 
	 *****************************************/
	
	public InvalidBookingUsernameException(String message) {
		super(message);
	}

}
