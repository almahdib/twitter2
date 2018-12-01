package com.Tanalysis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tanalysis.entities.SearchedWord;

public interface SearchWordRepository extends JpaRepository<SearchedWord, Long> {
	public SearchedWord findSearchedWordByWord(String word);

}
