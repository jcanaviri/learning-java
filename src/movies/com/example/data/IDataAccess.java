package movies.com.example.data;

import movies.com.example.domain.Movie;
import movies.com.example.exceptions.DataAccessEx;
import movies.com.example.exceptions.ReadDataEx;
import movies.com.example.exceptions.WriteDataEx;

import java.util.List;

@SuppressWarnings("unused")
public interface IDataAccess {
    boolean isAlreadyRegistered(String filename);

    List<Movie> getAll(String filename) throws ReadDataEx;

    void write(Movie movie, String filename, boolean isAppend) throws WriteDataEx;

    String search(String filename, String look) throws ReadDataEx;

    void insert(String filename) throws DataAccessEx;

    void delete(String filename) throws DataAccessEx;
}
