package files;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filename = "hello.txt";
        readFile(filename);
    }

    public static void createFile(String filename) {
        // Creating a new file
        File newFile = new File(filename);

        try {
            // Opening the file
            PrintWriter output = new PrintWriter(newFile);

            output.println("Hello, World!");

            // This line is the one that creates the file
            output.close();

            System.out.println("A file has been created");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void writeFile(String filename, String content) {
        // Creating a new file
        File newFile = new File(filename);

        try {
            // Opening the file
            PrintWriter output = new PrintWriter(newFile);

            output.println(content);

            // This line is the one that creates the file
            output.close();

            System.out.println("A file with content has been created");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void appendFileContent(String filename, String content) {
        // Creating a new file
        File newFile = new File(filename);

        try {
            // Opening the file
            // The class FileWriter with a true value will append the content to the file
            PrintWriter output = new PrintWriter(new FileWriter(filename, true));

            output.println(content);

            // This line is the one that creates the file
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile(String filename) {
        File fileToRead = new File(filename);

        try {
            BufferedReader input = new BufferedReader(new FileReader(fileToRead));
            String line = input.readLine();

            while (line != null) {
                System.out.println(line);
                line = input.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
