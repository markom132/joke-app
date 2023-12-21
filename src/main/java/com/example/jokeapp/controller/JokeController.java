package com.example.jokeapp.controller;

import com.example.jokeapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeService jokeService = new JokeService();

    @RequestMapping("/joke")
    public String getJokes(Model model){
        model.addAttribute("jokes", jokeService.getJoke());
        return "jokes/index";
    }

}
