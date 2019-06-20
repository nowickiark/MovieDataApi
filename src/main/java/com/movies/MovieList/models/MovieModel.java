package com.movies.MovieList.models;

public class MovieModel {

    private String movieName;
    private int movieYear;
    private String countryProduction;
    private String genre;
    private Person director;


    public MovieModel(String movieName, int movieYear, String countryProduction, String genre, Person director) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.countryProduction = countryProduction;
        this.genre = genre;
        this.director = director;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    public String getCountryProduction() {
        return countryProduction;
    }

    public void setCountryProduction(String countryProduction) {
        this.countryProduction = countryProduction;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }





}
