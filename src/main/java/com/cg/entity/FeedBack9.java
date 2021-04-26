package com.cg.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*********************************************************************
 * 
 * @author Harshitha V 
 * Version: 1.0 
 * Date: 20-04-2021 
 * Description: This is the entity class of the Feedback module
 *
 *********************************************************************/

@Entity
@Table(name = "feedback9")
public class FeedBack9 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feedbackId;
	private int ratings;
	private String comments;
	private String username;
	private String routeName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User9 user;

	/******************************************************************
	 * Description: Getter & Setter functions for the above attributes
	 * 
	 ******************************************************************/

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public User9 getUser() {
		return user;
	}

	public void setUser(User9 user) {
		this.user = user;
	}

	/****************************************************
	 * 
	 * @author Harshitha V
	 * @param feedbackId
	 * @param ratings
	 * @param comments
	 * @param username
	 * @param routeName
	 * @param user       
	 * This is a parameterized constructor
	 * 
	 ******************************************************/

	public FeedBack9(int feedbackId, int ratings, String comments, String username, String routeName, User9 user) {
		super();
		this.feedbackId = feedbackId;
		this.ratings = ratings;
		this.comments = comments;
		this.username = username;
		this.routeName = routeName;
		this.user = user;
	}

	/**********************************
	 * 
	 * @author Hasrshitha V 
	 * This is a no-arg constructor
	 * 
	 **********************************/

	public FeedBack9() {
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
		return "FeedBack8 [feedbackId=" + feedbackId + ", ratings=" + ratings + ", comments=" + comments + ", username="
				+ username + ", routeName=" + routeName + ", user=" + user + "]";
	}

}