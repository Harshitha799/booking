package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*************************************************************************
 * 
 * @author Harshitha V
 * Description: This is global exception class to handle all exceptions
 * Created date: 23-04-2021
 * 
 *************************************************************************/


@RestControllerAdvice
public class OnlineBusBookingController  
{
	
	/****************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 22-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(BookingValidationException.class)
	public ResponseEntity<Object> handleException(BookingValidationException exception)
	{
		return new ResponseEntity<Object>(exception.getMessages(), HttpStatus.BAD_REQUEST);
	}
	
	/****************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 22-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = IdNotFoundException.class)
	public ResponseEntity<Object> handleException(IdNotFoundException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	}
	
	/****************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 22-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = InvalidBookingException.class)
	public ResponseEntity<Object> handleException(InvalidBookingException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}
	
	/****************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 22-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = InvalidBusRouteNameException.class)
	public ResponseEntity<Object> handleException(InvalidBusRouteNameException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	}
	
	/****************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 22-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = InvalidDateException.class)
	public ResponseEntity<Object> handleException(InvalidDateException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	}
	
	/****************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 22-04-2021
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ***************************************************************************************/
	
	@ExceptionHandler(value = InvalidBookingUsernameException.class)
	public ResponseEntity<Object> handleException(InvalidBookingUsernameException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	}
	
	
	
	
	
	
	
	
}
