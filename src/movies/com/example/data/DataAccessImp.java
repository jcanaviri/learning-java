package movies.com.example.data;

import movies.com.example.domain.Movie;
import movies.com.example.exceptions.DataAccessEx;
import movies.com.example.exceptions.ReadDataEx;
import movies.com.example.exceptions.WriteDataEx;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class DataAccessImp implements IDataAccess {
    @Override
    public boolean isAlreadyRegistered(String resourceName) throws DataAccessEx {
        File someFile = new File(resourceName);
        return someFile.exists();
    }

    @Override
    public List<Movie> getAll(String resourceName) throws ReadDataEx {
        File someFile = new File(resourceName);
        List<Movie> movies = new ArrayList<>();

        try {
            BufferedReader input = new BufferedReader(new FileReader(someFile));
            String line = input.readLine();

            while (line != null) {
                Movie newMovie = new Movie(line);
                movies.add(newMovie);

                // goes to the next line in the file
                line = input.readLine();
            }

            input.close();
        } catch (IOException e) {
            throw new ReadDataEx("Exception to list movies: " + e.getMessage());
        }

        return movies;
    }

    @Override
    public void write(Movie movie, String resourceName, boolean isAppend) throws WriteDataEx {
        File someFile = new File(resourceName);
        try {
            PrintWriter output = new PrintWriter(new FileWriter(someFile, isAppend));

            output.println(movie.toString());

            output.close();

            System.out.println("OK");
        } catch (IOException e) {
            throw new WriteDataEx("Exception to read movies: " + e.getMessage());
        }
    }

    @Override
    public String search(String resourceName, String look) throws ReadDataEx {
        return null;
    }

    @Override
    public void insert(String resourceName) throws DataAccessEx {

    }

    @Override
    public void delete(String resourceName) throws DataAccessEx {

    }
}
