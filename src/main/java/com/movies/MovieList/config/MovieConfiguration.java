package com.movies.MovieList.config;

import com.movies.MovieList.data.MovieDataSetManual;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfiguration {

    @Bean
    public MovieDataSetManual movieDataSet(){
        return new MovieDataSetManual();
    }

}
