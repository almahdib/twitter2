package com.Tanalysis.Classifiers;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Result implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
	private double tweetsPos;
	private double tweetsNeg;
	private double tweetsNeutral;
	private double numberTweetsAnalysis;
	
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Result(double tweetsPos, double tweetsNeg, double tweetsNeutral, double numberTweetsAnalysis) {
		super();
		this.tweetsPos = tweetsPos;
		this.tweetsNeg = tweetsNeg;
		this.tweetsNeutral = tweetsNeutral;
		this.numberTweetsAnalysis = numberTweetsAnalysis;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getTweetsPos() {
		return tweetsPos;
	}
	public void setTweetsPos(double tweetsPos) {
		this.tweetsPos = tweetsPos;
	}
	public double getTweetsNeg() {
		return tweetsNeg;
	}
	public void setTweetsNeg(double tweetsNeg) {
		this.tweetsNeg = tweetsNeg;
	}
	public double getTweetsNeutral() {
		return tweetsNeutral;
	}
	public void setTweetsNeutral(double tweetsNeutral) {
		this.tweetsNeutral = tweetsNeutral;
	}
	public double getNumberTweetsAnalysis() {
		return numberTweetsAnalysis;
	}
	public void setNumberTweetsAnalysis(double numberTweetsAnalysis) {
		this.numberTweetsAnalysis = numberTweetsAnalysis;
	}
	

}
