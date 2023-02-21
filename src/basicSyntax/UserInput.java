package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Declare a new Scanner instance
        Scanner sc = new Scanner(System.in);

        System.out.print("Please write your name: ");
        String user = sc.nextLine();
        System.out.println("So you are " + user + ".");

        System.out.print("Please tell me your age: ");
        int age = sc.nextInt();
        System.out.println("I see, you are " + age + " years old.");

        // Declare a BufferReader instance
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter your age: ");
        String ageString = null;
        try {
            ageString = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("You are " + ageString + " years old.");
    }
}
