package com.Tanalysis.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.stream.Collectors;

import com.Tanalysis.GetTwitetr;
import com.Tanalysis.entities.SearchedWord;
import com.Tanalysis.entities.Tweet;
import com.Tanalysis.entities.User;
import com.Tanalysis.repositories.SearchWordRepository;
import com.Tanalysis.repositories.TweetRepository;
import com.Tanalysis.repositories.UserRepository;

import twitter4j.TwitterException;
@CrossOrigin()

@RestController
public class ContrTwitter {
	
	GetTwitetr engineSearch = new GetTwitetr();
	
	@Autowired
	TweetRepository repository;
	@Autowired
	UserRepository userRepo;
	@Autowired                    
	SearchWordRepository reSearchWordRepository;   
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public Collection<Tweet> getTweetsBySearch(
			@RequestParam(name = "search") String search)
	{
		//ArrayList<Tweet> tweets = null;
		/*try {
			 tweets = engineSearch.getTweets(search);
			 if(tweets != null)
			 {
				// repository.saveAll(tweets);
					for( Tweet twita:tweets)
						repository.save(twita);
					System.out.println("finiiiiiiiiiiiiiiiiiiiiiiiish");


			 }
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		 return repository.findAll();	}
	ArrayList<Tweet> tweets = null;
	@CrossOrigin
	@RequestMapping(value ="/search/{id}", method = RequestMethod.GET)
	public ArrayList<Tweet>  user2(@PathVariable String id) throws TwitterException {
		ArrayList<Tweet> tweets = null;
		SearchedWord word = new SearchedWord(id);
		User user = new User("admin","a@ad.com","12345678");
		userRepo.save(user);
		word.setUser(user);
		reSearchWordRepository.save(word);
	  //  SearchedWord  searchedWord = reSearchWordRepository.findSearchedWordByWord(id);
		GetTwitetr twitetr = new GetTwitetr();

		tweets = twitetr.getTweets(id);
		 if(tweets != null)
				 {String   test=("ID is "+id);
        			// repository.saveAll(tweets);
        				for( Tweet twita:tweets)
        				{
        					twita.setWord(word);	
        					repository.save(twita);  
        				}
        				
        				System.out.println("finiiiiiiiiiiiiiiiiiiiiiiiish");


        		 }


		return (tweets);
	}

}
