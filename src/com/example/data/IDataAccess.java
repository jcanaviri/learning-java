package com.example.data;

import com.example.domain.Movie;
import com.example.exceptions.DataAccessEx;
import com.example.exceptions.ReadDataEx;
import com.example.exceptions.WriteDataEx;

import java.util.List;

@SuppressWarnings("unused")
public interface IDataAccess {

    boolean exists(String filename) throws DataAccessEx;

    List<Movie> getAllMovies(String filename) throws ReadDataEx;

    void write(Movie movie, String filename, boolean canAdd) throws WriteDataEx;

    String lookUp(String filename, String keyword) throws ReadDataEx;

    void create(String filename) throws DataAccessEx;

    void delete(String filename) throws DataAccessEx;
}
