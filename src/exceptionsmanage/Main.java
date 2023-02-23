package exceptionsmanage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // There are many exceptions in java
        // these are the more popular
        try {
            // * This code throws the error of zero division
            // System.out.println(15 / 0);
            System.out.println(15 / 3);
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

            a[2] = 42;

            // * This will throw an error because we are trying to access
            // * the fifth element of an array with just three
            // a[5] = 42;

            System.out.println("a = " + Arrays.toString(a));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of the range");
        }

        int result = Arithmetic.division(42, 0);
        System.out.println(result);
    }
}
