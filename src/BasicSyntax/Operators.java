package BasicSyntax;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int a = 4, b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Division: " + (a * 1.0 / b));
        System.out.println("Division: " + (a * 1D / b));
        System.out.println("Modulus: " + (a % b));

        a += 1;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);

        String myFirstString = "Hello";

        Scanner sc = new Scanner(System.in);
        System.out.print("Gimme the second string: ");
        String mySecondString = sc.nextLine();

        // The code commented is a valid way to compare things
        // but the method .equals() is more recommended.
        // System.out.println(myFirstString == mySecondString);
        System.out.println(myFirstString.equals(mySecondString));

        // The ternary operator
        System.out.print("The boolean value should be true or false: ");
        boolean isValid = sc.nextBoolean();
        String result = isValid ? "yes" : "no";
        System.out.println(result);
        sc.close();
    }
}
