package movies.com.example.data;

import movies.com.example.domain.Movie;
import movies.com.example.exceptions.DataAccessEx;
import movies.com.example.exceptions.ReadDataEx;
import movies.com.example.exceptions.WriteDataEx;

import java.util.List;

@SuppressWarnings("unused")
public interface IDataAccess {
    boolean isAlreadyRegistered(String resourceName) throws DataAccessEx;

    List<Movie> getAll(String resourceName) throws ReadDataEx;

    void write(Movie movie, String resourceName, boolean isAppend) throws WriteDataEx;

    String search(String resourceName, String look) throws ReadDataEx;

    void insert(String resourceName) throws DataAccessEx;

    void delete(String resourceName) throws DataAccessEx;
}
