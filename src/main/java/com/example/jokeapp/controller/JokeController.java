package com.example.jokeapp.controller;

import com.example.jokeapp.service.JokeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;
    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/joke")
    public String getJokes(Model model){
        model.addAttribute("jokes", jokeService.getJoke());
        return "jokes/index";
    }

}
