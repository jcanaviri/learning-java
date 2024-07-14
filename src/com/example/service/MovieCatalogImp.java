package com.example.service;

import com.example.data.DataAccessImp;
import com.example.data.IDataAccess;
import com.example.domain.Movie;
import com.example.exceptions.DataAccessEx;
import com.example.exceptions.ReadDataEx;

@SuppressWarnings("unused")
public class MovieCatalogImp implements IMovieCatalog {
    private final IDataAccess data;

    public MovieCatalogImp() {
        this.data = new DataAccessImp();
    }

    @Override
    public void addMovie(String name) {
        var movie = new Movie(name);
        try {
            boolean canAppend = this.data.exists(RESOURCE_NAME);
            this.data.write(movie, RESOURCE_NAME, canAppend);
        } catch (DataAccessEx e) {
            e.printStackTrace(System.out);
        }

    }

    @Override
    public void getAllMovies() {
        try {
            var movies = this.data.getAllMovies(RESOURCE_NAME);
            movies.forEach(System.out::println);
        } catch (ReadDataEx e) {
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void lookUpMovie(String keyword) {
        String result;
        try {
            result = this.data.lookUp(RESOURCE_NAME, keyword);
            System.out.println("result = " + result);
        } catch (ReadDataEx e) {
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void startCatalog() {
        try {
            if (this.data.exists(RESOURCE_NAME)) {
                this.data.delete(RESOURCE_NAME);
                this.data.create(RESOURCE_NAME);
            } else {
                this.data.create(RESOURCE_NAME);
            }
        } catch (DataAccessEx e) {
            throw new RuntimeException(e);
        }
    }
}
