package com.cg.dto;

import java.time.LocalDate;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.cg.entity.Passenger9;
import com.cg.entity.User9;

/******************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is dto class
 * Created date: 25-04-2021
 * 
 ******************************************************************/

public class Bookingdto9 
{
	@NotEmpty(message="username should not be empty")
	@Length(min = 3, max = 15)
	private String username; 
	private String busNumber;
	private String source;
	private String destination;
	private Integer numberOfSeats;
	private Integer amountPaid;
	public LocalDate datenm;
	@NotEmpty(message="passengerId can not be empty")
	private Integer passengerId;
	@NotEmpty(message="userid can not be empty")
	private Integer userId;
	
	
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
	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public Integer getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(Integer amountPaid) {
		this.amountPaid = amountPaid;
	}
	public LocalDate getDatenm() {
		return datenm;
	}
	public void setDatenm(LocalDate datenm) {
		this.datenm = datenm;
	}
	public Integer getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
	public Bookingdto9(@NotEmpty(message = "username should not be empty") @Length(min = 3, max = 15) String username,
			String busNumber, String source, String destination, Integer numberOfSeats, Integer amountPaid,
			LocalDate datenm, @NotEmpty(message = "passengerId can not be empty") Integer passengerId,
			@NotEmpty(message = "userid can not be empty") Integer userId) {
		super();
		this.username = username;
		this.busNumber = busNumber;
		this.source = source;
		this.destination = destination;
		this.numberOfSeats = numberOfSeats;
		this.amountPaid = amountPaid;
		this.datenm = datenm;
		this.passengerId = passengerId;
		this.userId = userId;
	}
	
	
	public Bookingdto9() {
		super();
	}
	
	
	

}
