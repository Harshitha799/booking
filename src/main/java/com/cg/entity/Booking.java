package com.cg.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

/*********************************************************************
 * 
 * @author Harshitha V 
 * Version: 1.0 
 * Date: 19-04-2021 
 * Description: This is the entity class of the Booking module
 *
 *********************************************************************/

@Entity
@Table
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "booking_Counter", sequenceName = "booking_Sequence", initialValue = 1)
	private long bookingId;
	@NotEmpty(message = "username should not be empty")
	@Length(min = 3, max = 15)
	private String username;
	private String busNumber;
	private String source;
	private String destination;
	private int numberOfSeats;
	private int amountPaid;
	public LocalDate datenm;

	@ManyToOne
	@JoinColumn(name = "passengerId")
	private Passenger passengerInfo;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User userInfo;

	/******************************************************************
	 * Description: Getter & Setter functions for the above attributes
	 * 
	 ******************************************************************/

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}

	public LocalDate getDatenm() {
		return datenm;
	}

	public void setDatenm(LocalDate datenm) {
		this.datenm = datenm;
	}

	public Passenger getPassengerInfo() {
		return passengerInfo;
	}

	public void setPassengerInfo(Passenger passengerInfo) {
		this.passengerInfo = passengerInfo;
	}

	public User getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}

	/****************************************************
	 * 
	 * @author Harshitha V
	 * @param bookingId
	 * @param username
	 * @param busNumber
	 * @param source
	 * @param destination
	 * @param numberOfSeats
	 * @param amountPaid
	 * @param datenm
	 * @param passengerInfo
	 * @param userInfo      
	 * This is a parameterized constructor
	 * 
	 ******************************************************/
	public Booking(long bookingId, @NotEmpty(message = "username should not be empty") String username,
			String busNumber, String source, String destination, int numberOfSeats, int amountPaid, LocalDate datenm,
			Passenger passengerInfo, User userInfo) {
		super();
		this.bookingId = bookingId;
		this.username = username;
		this.busNumber = busNumber;
		this.source = source;
		this.destination = destination;
		this.numberOfSeats = numberOfSeats;
		this.amountPaid = amountPaid;
		this.datenm = datenm;
		this.passengerInfo = passengerInfo;
		this.userInfo = userInfo;
	}

	/**********************************
	 * 
	 * @author Harshitha V 
	 * This is a no-arg constructor
	 * 
	 **********************************/

	public Booking() {
		super();

	}

	/*******************************
	 * 
	 * @author Harshitha V 
	 * This is toString() method
	 * 
	 *******************************/

	@Override
	public String toString() {
		return "Booking9 [bookingId=" + bookingId + ", username=" + username + ", busNumber=" + busNumber + ", source="
				+ source + ", destination=" + destination + ", numberOfSeats=" + numberOfSeats + ", amountPaid="
				+ amountPaid + ", datenm=" + datenm + ", passengerInfo=" + passengerInfo + ", userInfo=" + userInfo
				+ "]";
	}

}
