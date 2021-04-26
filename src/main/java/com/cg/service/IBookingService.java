package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dto.Bookingdto9;
import com.cg.entity.Booking9;
import com.cg.entity.FeedBack9;
import com.cg.entity.Passenger9;
import com.cg.entity.User9;


/**************************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is the service layer's IBookingService interface
 * Created date: 21-04-2021
 * 
 ****************************************************************************/


@Service
public interface IBookingService 
{
	public long addBooking(Booking9 booking); 
	
	public void deleteBooking(long bookingId); 

	boolean updateBookingDate(long bookingId, Booking9 booking);

	public Booking9 getBookingDetailsById(long bookingId);

	public Booking9 getAllBookingsByUsername(String username);
	
	public List<FeedBack9> getFeedBackByBusRoute(String routeName);

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public Passenger9 addPassenger(Passenger9 passenger);
//
//	public User9 addUser(User9 user);
//	
//	
//	
//	public FeedBack9 addFeedback(FeedBack9 feedback);
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
