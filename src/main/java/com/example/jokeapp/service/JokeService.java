package com.example.jokeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    public String getJoke(){
        String joke = chuckNorrisQuotes.getRandomQuote();
        return joke;
    }

}
