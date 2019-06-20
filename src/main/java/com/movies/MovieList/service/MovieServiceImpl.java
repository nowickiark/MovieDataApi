package com.movies.MovieList.service;

import com.movies.MovieList.data.MovieDataSet;
import com.movies.MovieList.data.MovieDataSetManual;
import com.movies.MovieList.models.MovieModel;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieDataSet movieDataSet;

    public MovieServiceImpl(MovieDataSet movieDataSet) {
        this.movieDataSet = movieDataSet;
    }


    @Override
    public MovieModel getMovie() {
        return movieDataSet.getMovieSet().get(0);
    }


}
