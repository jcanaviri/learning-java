package files;

import java.io.*;

public class FilesHandling {
    public static void createFile(String filename) {
        File file = new File(filename);
        try {
            PrintWriter output = new PrintWriter(file);
            output.close();
            System.out.println("The file has been created.");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void writeFile(String filename, String content) {
        File file = new File(filename);
        try {
            PrintWriter output = new PrintWriter(file);
            output.println(content);
            output.close();
            System.out.println("The file has been written.");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void writeFileAppend(String filename, String content) {
        File file = new File(filename);
        try {
            PrintWriter output = new PrintWriter(new FileWriter(file, true));
            output.println(content);
            output.close();
            System.out.println("The file has been updated.");
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void readFile(String filename) {
        File file = new File(filename);
        try {
            var input = new BufferedReader(new FileReader(file));
            var content = input.readLine();
            while (content != null) {
                System.out.println("content = " + content);
                content = input.readLine();
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
