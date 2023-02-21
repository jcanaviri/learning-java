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
    public boolean isAlreadyRegistered(String filename) {
        // Returns true if the file exists and false if isn't
        File file = new File(filename);
        return file.exists();
    }

    @Override
    public List<Movie> getAll(String filename) throws ReadDataEx {
        // Returns a list with the movies in it
        File file = new File(filename);
        List<Movie> movies = new ArrayList<>();

        try {
            BufferedReader input = new BufferedReader(new FileReader(file));
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
    public void write(Movie movie, String filename, boolean isAppend) throws WriteDataEx {
        // Creates a new movie in the file
        File file = new File(filename);
        try {
            PrintWriter output = new PrintWriter(new FileWriter(file, isAppend));
            output.println(movie.toString());

            output.close();
            System.out.println("OK");
        } catch (IOException e) {
            throw new WriteDataEx("Exception to read movies: " + e.getMessage());
        }
    }

    @Override
    public String search(String filename, String look) throws ReadDataEx {
        // Looks up the movie in the file
        File file = new File(filename);

        try {
            BufferedReader input = new BufferedReader(new FileReader(file));
            String line = input.readLine();
            int index = 1;

            while (line != null && look != null) {
                if (look.equalsIgnoreCase(line))
                    return "Found at index: " + index;

                // goes to the next line in the file
                line = input.readLine();
                index++;
            }

            input.close();
        } catch (IOException e) {
            throw new ReadDataEx("Exception to read movies: " + e.getMessage());
        }

        return null;
    }

    @Override
    public void insert(String filename) throws DataAccessEx {
        // Creates the file
        File file = new File(filename);
        try {
            PrintWriter output = new PrintWriter(new FileWriter(file));
            output.close();
            System.out.println("The file: " + filename + " has been created");
        } catch (IOException e) {
            throw new DataAccessEx("Exception to read movies: " + e.getMessage());
        }
    }

    @Override
    public void delete(String filename) throws DataAccessEx {
        // Deletes the file from the disk
        File file = new File(filename);
        // canDelete tell us if the file exists or no
        boolean canDelete = file.exists();
        // if file exists, we can delete it
        boolean isDeleted = canDelete && file.delete();

        if (isDeleted)
            System.out.println("The file has been deleted");
        else
            throw new DataAccessEx("Exception to read the data");
    }
}
