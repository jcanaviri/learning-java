package com.example.data;

import com.example.domain.Movie;
import com.example.exceptions.DataAccessEx;
import com.example.exceptions.ReadDataEx;
import com.example.exceptions.WriteDataEx;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class DataAccessImp implements IDataAccess {
    @Override
    public boolean exists(String filename) throws DataAccessEx {
        File file = new File(filename);
        return file.exists();
    }

    @Override
    public List<Movie> getAllMovies(String filename) throws ReadDataEx {
        var file = new File(filename);
        List<Movie> movies = new ArrayList<>();

        try {
            var input = new BufferedReader(new FileReader(file));
            String line = input.readLine();
            while (line != null) {
                var movie = new Movie(line);
                movies.add(movie);

                line = input.readLine();
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new ReadDataEx(e.getMessage());
        }

        return movies;
    }

    @Override
    public void write(Movie movie, String filename, boolean canAdd) throws WriteDataEx {
        var file = new File(filename);

        try {
            PrintWriter output = canAdd ?
                    new PrintWriter(new FileWriter(file, true)) :
                    new PrintWriter(file);
            output.println(movie.name());
            output.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            throw new WriteDataEx(e.getMessage());
        }
    }

    @Override
    public String lookUp(String filename, String keyword) throws ReadDataEx {
        var file = new File(filename);
        String result = null;
        try {
            var output = new BufferedReader(new FileReader(file));
            String line = output.readLine();
            int i = 1;
            while (line != null) {
                if (line.equalsIgnoreCase(keyword)) {
                    result = line;
                    System.out.println("Found at index i = " + i);
                    break;
                }

                i++;
                line = output.readLine();
            }
            output.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            throw new ReadDataEx(e.getMessage());
        }

        return result;
    }

    @Override
    public void create(String filename) throws DataAccessEx {
        var file = new File(filename);
        try {
            var output = new PrintWriter(new FileWriter(file));
            output.close();
            System.out.println("File has been created.");
        } catch (Exception e) {
            e.printStackTrace(System.out);
            throw new DataAccessEx(e.getMessage());
        }
    }

    @Override
    public void delete(String filename) {
        var file = new File(filename);
        if (file.exists()) return;

        boolean delete = file.delete();
        System.out.println(delete ? "The file has been deleted" : "Cannot delete the file");
    }
}
