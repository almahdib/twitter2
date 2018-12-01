package com.Tanalysis.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SearchedWord {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String word;
	
	@ManyToOne
	@JoinColumn(name = "User_id")
	private User user;
	
	@OneToMany(mappedBy="word")
	private Collection<Tweet> tweets;
	
	@OneToMany(mappedBy="word")
	private Collection<Result> results;
	
	
	public Collection<Result> getResults() {
		return results;
	}
	public void setResults(Collection<Result> results) {
		this.results = results;
	}
	public Collection<Tweet> getTweets() {
		return tweets;
	}
	public void setTweets(Collection<Tweet> tweets) {
		this.tweets = tweets;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
	public SearchedWord(String word) {
		super();
		this.word = word;
	}
	public SearchedWord() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
