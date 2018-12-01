package com.Tanalysis.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tweet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String user_id;
	@Column(columnDefinition="TEXT")
	private String tweet;
	private Date creation_date;
	private String username;
	//private ArrayList<String> hashtags = new ArrayList<>();
	public Tweet(String user_id, String tweet, Date creation_date, String username) {
		super();
		this.user_id = user_id;
		this.tweet = tweet;
		this.creation_date = creation_date;
		this.username = username;
		//this.hashtags = hashtags;//, ArrayList<String> hashtags
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getTweet() {
		return tweet;
	}
	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
	public Date getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Tweet() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
