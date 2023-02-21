package exceptionsmanage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // There are many exceptions in java
        // these are the more popular
        try {
            int a = 10, b = 0;

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        try {
            int a = Integer.parseInt("Josue");

            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("Cannot format a string to a number");
        }

        try {
            int[] a = new int[3];
            a[5] = 42;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of the range");
        }

        int result = Arithmetic.division(42, 0);
        System.out.println(result);
    }
}
