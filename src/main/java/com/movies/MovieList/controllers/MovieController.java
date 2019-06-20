package com.movies.MovieList.controllers;

import com.movies.MovieList.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @RequestMapping({"/",""})
    public String showMovie(Model model){

        model.addAttribute("movieName", movieService.getMovie().getMovieName());

        return "movies";

    }

}
