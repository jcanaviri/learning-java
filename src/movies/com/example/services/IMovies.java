package movies.com.example.services;

@SuppressWarnings("unused")
public interface IMovies {
    String FILENAME = "movies.txt";

    void addMovie(String newMovie);

    void getAllMovies();

    void searchMovie(String movieName);

    void startMovieDatabase();

    void deleteMovies();
}
