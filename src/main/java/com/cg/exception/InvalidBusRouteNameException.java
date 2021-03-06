package com.cg.exception;

/***********************************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is the implementation class of InvalidBusRouteNameException
 * Created date: 24-04-2021
 * 
 ************************************************************************************/

public class InvalidBusRouteNameException extends RuntimeException{
	
	/**************************************
	 * 
	 * @author Harshitha V
	 * Created date: 21-04-2021
	 * This is a no-arg constructor
	 * 
	 **************************************/
	
	public InvalidBusRouteNameException() {
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
	
	public InvalidBusRouteNameException(String message) {
		super(message);
	}
}
