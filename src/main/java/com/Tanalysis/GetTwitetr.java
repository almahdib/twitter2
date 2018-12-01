package com.Tanalysis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Tanalysis.entities.Tweet;
import com.Tanalysis.repositories.TweetRepository;

import twitter4j.HashtagEntity;
import twitter4j.Paging;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class GetTwitetr {
	
	
    public ArrayList<Tweet> getTweets(String search) throws TwitterException {
    	//Query query = new Query(search);
        QueryResult result;
    	Paging pg = new Paging(1, 200);
	    String userName = search;       
	    pg.setCount(200);
        ArrayList<Tweet> tweets = new ArrayList<>();
	    Twitter twitter= new TwitterFactory().getSingleton();
	   
	    	Query query = new Query(search);
	    	query.setCount(100);
	    	query.since("2016-05-28");
	    	try {
	      	  result = twitter.search(query);
	            List<Status> stats = result.getTweets();
	            
	            for (Status status:stats ) {
	            	
	    			Tweet t = new Tweet();
	    			          
	    			t.setUser_id(String.valueOf(status.getUser().getId()));
	    			t.setTweet(status.getText());
	    			t.setUsername(status.getUser().getName());
	    			t.setCreation_date(status.getCreatedAt());
	    			
	    			tweets.add(t);
	            }
	        }catch(TwitterException x) {
	            System.out.println(x.getMessage());
	          }
	    
       // List<Status> stats=twitter.getUserTimeline(userName, pg);///twitter.getHomeTimeline();
      
	    return tweets;
			        	
			            //System.out.println("*********Place Tweets :**************\npalce country :"+status.getPlace().getCountry()+"\nplace full name :"+status.getPlace().getFullName()+"\nplace name :"+status.getPlace().getName()+"\nplace id :"+status.getPlace().getId()+"\nplace tipe :"+status.getPlace().getPlaceType()+"\nplace addres :"+status.getPlace().getStreetAddress());
          /*  System.out.println("Status id : "+status.getId());
            System.out.println("id user : "+status.getUser().getId());
            System.out.println("Length status :  "+status.getText().length());
            System.out.println("@" + status.getUser().getScreenName() +" . "+status.getCreatedAt()+ " : "+status.getUser().getName()+"--------"+status.getText());
            System.out.println("url :"+status.getUser().getURL());
            System.out.println("url :"+status.getUser().getOriginalProfileImageURL());*/
        }
    	
    	
  /*
	public static void main(String[] args) throws TwitterException {
		Paging pg = new Paging();
	    String userName = "SergiSamper";
	    pg.setCount(200);
	    Twitter twitter= new TwitterFactory().getSingleton();
        List<Status> stats=twitter.getHomeTimeline();
        
        for (Status status:stats ) {
            //System.out.println("*********Place Tweets :**************\npalce country :"+status.getPlace().getCountry()+"\nplace full name :"+status.getPlace().getFullName()+"\nplace name :"+status.getPlace().getName()+"\nplace id :"+status.getPlace().getId()+"\nplace tipe :"+status.getPlace().getPlaceType()+"\nplace addres :"+status.getPlace().getStreetAddress());
            System.out.println("Status id : "+status.getId());
            System.out.println("id user : "+status.getUser().getId());
            System.out.println("Length status :  "+status.getText().length());
            System.out.println("@" + status.getUser().getScreenName() +" . "+status.getCreatedAt()+ " : "+status.getUser().getName()+"--------"+status.getText());
            System.out.println("url :"+status.getUser().getURL());
            System.out.println("url :"+status.getUser().getOriginalProfileImageURL());
        }

/*
	  Twitter twitter = new TwitterFactory(cb.build()).getInstance();
	  int numberOfTweets = 1000000;
	  long lastID = Long.MAX_VALUE;
	  
	  
	  ArrayList<Status> statuses = new ArrayList<>();
	  int pageno = 1;/*
	  while(true) {
	      try {
	          System.out.println("getting tweets");
	          int size = statuses.size(); // actual tweets count we got
	          Paging page = new Paging(pageno, 200);
	          statuses.addAll(twitter.getHomeTimeline());//getUserTimeline(userName, page)
	          System.out.println("total got : " + statuses.size());
	          if (statuses.size() == size) { break; } // we did not get new tweets so we have done the job
	          pageno++;
	          sleep(1000); // 900 rqt / 15 mn <=> 1 rqt/s
	          }
	      catch (TwitterException e) {
	          System.out.println(e.getMessage());
	          }
	      } 

	    }
	    static void sleep(long ms) {
	    try { Thread.sleep(ms); }
	    catch(InterruptedException ex) { Thread.currentThread().interrupt(); }
	    }*/

    
	}


