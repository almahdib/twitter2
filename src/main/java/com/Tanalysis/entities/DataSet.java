package com.Tanalysis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataSet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String tweet;
	private int classe;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTweet() {
		return tweet;
	}
	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
	public int getClasse() {
		return classe;
	}
	public void setClasse(int classe) {
		this.classe = classe;
	}
	public DataSet(String tweet, int classe) {
		super();
		this.tweet = tweet;
		this.classe = classe;
	}
	public DataSet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
