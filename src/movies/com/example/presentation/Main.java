package movies.com.example.presentation;

import movies.com.example.services.IMovies;
import movies.com.example.services.MoviesService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IMovies movies = new MoviesService();

        int option = -1;
        while (option != 0) {
            System.out.println("""
                    Choose your option
                    1.- Start the movies app
                    2.- Add new movie
                    3.- Show all movies
                    4.- Search one movie
                    0.- Quit""");
            System.out.print(">>> ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> movies.startMovieDatabase();
                case 2 -> {
                    System.out.print("New movie name: ");
                    var newName = sc.nextLine();
                    movies.addMovie(newName);
                }
                case 3 -> movies.getAllMovies();
                case 4 -> {
                    System.out.print("Tell me the name to look for: ");
                    String searchName = sc.nextLine();
                    movies.searchMovie(searchName);
                }
                case 0 -> {
                    movies.deleteMovies();
                    System.out.println("Bye bye!");
                }
                default -> System.out.println("Unknown option");
            }
        }
    }
}
