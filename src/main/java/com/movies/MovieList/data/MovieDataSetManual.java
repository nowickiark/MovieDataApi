package com.movies.MovieList.data;

import com.movies.MovieList.models.Director;
import com.movies.MovieList.models.MovieModel;

import java.util.ArrayList;
import java.util.List;

public class MovieDataSetManual implements MovieDataSet {

    private List<MovieModel> movieList;


    public MovieDataSetManual(){
        this.movieList = new ArrayList();

        movieList.add(new MovieModel("Toy Story 4",2019,"USA","Comedy",new Director("Josh","Cooley")));
        movieList.add(new MovieModel("Laleczka",2019,"Francja","Horror",new Director("Arek","Nowy")));
        movieList.add(new MovieModel("Król Lew",1991,"Anlia","Animation",new Director("Mike","Wielki")));


    }

    @Override
    public List<MovieModel> getMovieSet() {
        return movieList;
    }

}
