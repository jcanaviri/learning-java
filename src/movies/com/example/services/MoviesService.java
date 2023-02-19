package movies.com.example.services;

import movies.com.example.data.DataAccessImp;
import movies.com.example.data.IDataAccess;
import movies.com.example.domain.Movie;
import movies.com.example.exceptions.DataAccessEx;
import movies.com.example.exceptions.ReadDataEx;

import java.util.List;

@SuppressWarnings("unused")
public class MoviesService implements IMovies {

    private final IDataAccess db;

    public MoviesService() {
        this.db = new DataAccessImp();
    }

    @Override
    public void addMovie(String newMovie) {
        Movie movie = new Movie(newMovie);

        try {
            if (this.db.isAlreadyRegistered(FILENAME))
                this.db.write(movie, FILENAME, true);
        } catch (DataAccessEx e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getAllMovies() {
        try {
            List<Movie> allMovies = this.db.getAll(FILENAME);
            allMovies.forEach(System.out::println);
        } catch (ReadDataEx e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void searchMovie(String movieName) {
        try {
            System.out.println(this.db.search(FILENAME, movieName));
        } catch (ReadDataEx e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void startMovieDatabase() {
        try {
            if (this.db.isAlreadyRegistered(FILENAME))
                this.db.delete(FILENAME);

            this.db.insert(FILENAME);
        } catch (DataAccessEx e) {
            throw new RuntimeException(e);
        }
    }
}
