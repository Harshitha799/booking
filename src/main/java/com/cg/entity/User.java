package com.cg.entity;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


/*********************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Date: 20-04-2021
 * Description: This is the entity class of the User module
 *
 *********************************************************************/

@Entity
@Table
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="userCounter",sequenceName="userSequence",initialValue=1)
	private long userId; 
	@NotEmpty(message="username should not be empty")
	private String username;
	@NotEmpty(message="password should not be empty")
	private String password;

	@OneToMany(mappedBy="userInfo", cascade=  CascadeType.ALL)
	private List<Booking> bookingobj;

	
	/******************************************************************
	 * Description: Getter & Setter functions for the above attributes
	 * 
	 ******************************************************************/
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Booking> getBookingobj() {
		return bookingobj;
	}

	public void setBookingobj(List<Booking> bookingobj) {
		this.bookingobj = bookingobj;
	}
	
	
	/****************************************************
	 * 
	 * @author Harshitha V
	 * @param userId
	 * @param username
	 * @param password
	 * @param bookingobj
	 * This is a parameterized constructor
	 * 
	 ******************************************************/

	public User(long userId, String username, String password, List<Booking9> bookingobj) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.bookingobj = bookingobj;
	}
	
	
	/**********************************
	 * 
	 * @author Hasrshitha V
	 * This is a no-arg constructor
	 * 
	 **********************************/
	
	public User() {
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
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", bookingobj="
				+ bookingobj + "]";
	}
	
	
	
	
	
	
	

}
