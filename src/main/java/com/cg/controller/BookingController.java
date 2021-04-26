package com.cg.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Booking9;
import com.cg.entity.FeedBack9;
import com.cg.entity.Passenger9;
import com.cg.entity.User9;
import com.cg.exception.BookingValidationException;
import com.cg.exception.IdNotFoundException;
import com.cg.exception.InvalidBookingException;
import com.cg.exception.InvalidBookingUsernameException;
import com.cg.exception.InvalidBusRouteNameException;
import com.cg.exception.InvalidDateException;

import com.cg.service.BookingServiceImpl;

import io.swagger.annotations.Api;


/******************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is controller methods implementation
 * Created date: 21-04-2021
 * 
 ******************************************************************/

@RestController
@Api(value = "Booking API")
@RequestMapping(value = "/OnlineBusBooking/booking")
public class BookingController {

	
	@Autowired
	BookingServiceImpl bookingService;

	
	/*********************************************************
	 * Method: addBooking
	 * @author: Harshitha V
	 * @param: Booking
	 * @return: this method returns a new ResponseEntity with an appropriate response code
	 * @throws: this method can throw BookingValidationException
	 * @throws: this method can throw InvalidBookingException
	 * Description: Adds new booking details into the database
	 * 
	 **********************************************************/
	
	@PostMapping(value = "/addBooking")
	public ResponseEntity<Object> addBooking(@Valid @RequestBody Booking9 booking, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			List<FieldError> errors = bindingResult.getFieldErrors();
			List<String> errorList = new ArrayList<String>();
			for (FieldError error : errors) {
				errorList.add(error.getDefaultMessage());
			}
			throw new BookingValidationException(errorList);
		}
		try {
			long bookadd = bookingService.addBooking(booking);
			return new ResponseEntity<Object>("Booked successfully and booking Id is " + bookadd, HttpStatus.OK);
		} catch (InvalidBookingException e) {
			throw new InvalidBookingException("The above institution code / user id already exists");
		}
	}

	
	/*********************************************************************************
	 * Name: deleteBooking
	 * @author: Harshitha V
	 * @param: Integer
	 * @return: this method returns a new ResponseEntity with bookingId
	 * @throws: this method can throw IdNotFoundException
	 * Description: Deletes booking details having the ID that is passed as parameter
	 * 
	 *********************************************************************************/
	
	@DeleteMapping(value = "/deleteBooking/{bookingId}")
	public ResponseEntity<Object> deleteBooking(@PathVariable int bookingId) throws IdNotFoundException {

		try {
			bookingService.deleteBooking(bookingId);
			return new ResponseEntity<Object>("Booking of ID" + bookingId + " has been Cancelled.", HttpStatus.OK);
		} catch (IdNotFoundException e) {
			throw new IdNotFoundException("No such Id found");
		}
	}

	
	/***********************************************************
	 * Method: updateBookingDate
	 * @author: Harshitha V
	 * @param: Long, Booking
	 * @return: ResponseEntity<Object>
	 * @throws: this method can throw IdNotFoundException
	 * @throws this method can throw BookingValidationException
	 * Description: Updates booking details of an exsisting Id. 
	 * 
	 ************************************************************/
	@PutMapping(value = "/updateBookingDate/{bookingId}")
	public ResponseEntity<Object> updateBookingDate(@Valid @PathVariable long bookingId, @RequestBody Booking9 booking, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			List<FieldError> errors = bindingResult.getFieldErrors();
			List<String> errorList = new ArrayList<String>();
			for (FieldError error : errors) {
				errorList.add(error.getDefaultMessage());
			}
			throw new BookingValidationException(errorList);
		}
		try {
			bookingService.updateBookingDate(bookingId, booking);
		} 
		catch (IdNotFoundException e) {
			throw new IdNotFoundException("Booking not found");
		}
		return new ResponseEntity<Object>("Your booking has been updated", HttpStatus.OK);
	}

	
	/************************************************************************
	 * Method: getBookingDetailsById
	 * @author: Harshitha V
	 * @param: Long
	 * @return: Booking
	 * @throws this method can throw IdNotFoundException
	 * Description: Retrieves booking details based on bookingId if it exists
	 * 				
	 *************************************************************************/
	
	@GetMapping("/getBookingDetailsById/{bookingId}")
	public Booking9 getBookingDetailsById(@PathVariable Long bookingId) {

		try {
			return bookingService.getBookingDetailsById(bookingId);
			
		}
		catch (IdNotFoundException e) {
			throw new IdNotFoundException("Id not found");
		}

	}

	
	/***************************************************************************
	 * Name: getAllBookingsByUsername
	 * @author: Harshitha V
	 * @param: String
	 * @return: Booking
	 * @throws this method can throw InvalidBookingUsernameException
	 * Description: Returns booking details by passing username as the parameter
	 * 
	 ***************************************************************************/
	
	@GetMapping(value = "/getAllBookingsByUsername/{username}")
	public Booking9 getAllBookingsByUsername(@PathVariable String username) {

		try {
			return bookingService.getAllBookingsByUsername(username);
		} 
		catch (InvalidBookingUsernameException e) {
			throw new InvalidBookingUsernameException("No Booking details are found");
		}

	}

	
	/************************************************************************************
	 * Name: getFeedBackByBusRoute
	 * @author: Harshitha V
	 * @param: String
	 * @return: List<FeedBack>
	 * @throws this method can throw InvalidBusRouteNameException
	 * Description: Lists out all feedbacks of a bus route by passing routename parameter
	 * 
	 *************************************************************************************/
	
	@GetMapping(value = "/getFeedBackByBusRoute/{routeName}")
	public List<FeedBack9> getFeedBackByBusRoute(@PathVariable String routeName) {

		try {
			return bookingService.getFeedBackByBusRoute(routeName);
		} 
		catch (InvalidBusRouteNameException e) {
			throw new InvalidBusRouteNameException("Incorrect bus route name");
		}

	}





}
