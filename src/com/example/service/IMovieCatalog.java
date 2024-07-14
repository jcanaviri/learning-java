package com.example.service;

import com.example.domain.Movie;

@SuppressWarnings("unused")
public interface IMovieCatalog {
    String RESOURCE_NAME = "movies.txt";

    void addMovie(String name);

    void getAllMovies();

    void lookUpMovie(String keyword);

    void startCatalog();
}