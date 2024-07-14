package com.example.main;

import com.example.service.IMovieCatalog;
import com.example.service.MovieCatalogImp;

import java.util.Scanner;

public class Presentation {
    public static void main(String[] args) {
        var option = -1;
        Scanner scanner = new Scanner(System.in);
        IMovieCatalog catalog = new MovieCatalogImp();

        while (option != 0) {
            System.out.println("""
                    Chose one option:\s
                    1. Start movie catalog
                    2. Add a movie
                    3. Show all movies
                    4. Search a movie
                    0. Exit""");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    catalog.startCatalog();
                    break;
                case 2:
                    System.out.print("Movie name: ");
                    var name = scanner.nextLine();
                    catalog.addMovie(name);
                    break;
                case 3:
                    catalog.getAllMovies();
                    break;
                case 4:
                    System.out.print("Movie name: ");
                    var movie = scanner.nextLine();
                    catalog.lookUpMovie(movie);
                    break;
                case 0:
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("UNKNOWN");
                    break;
            }
        }
    }
}
