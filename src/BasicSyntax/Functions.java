package BasicSyntax;

import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {
        System.out.println("The first ten fibonacci numbers are: ");
        for (int i = 0; i < 10; i++)
            System.out.print(fibonacci(i) + " ");

        System.out.println("\nFactorial(5) = " + factorial(5));

        System.out.println("The reversed word of \"Canaviri\" is: " + reverseWord("Canaviri"));

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(secondLargest(array)); // Output: 4
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return factorial(n - 1) * n;
    }

    public static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }

    public static int secondLargest(int[] array) {
        int max = array[0], secondMax = array[1];

        for (int item : array) {
            if (item > max) {
                secondMax = max;
                max = item;
            } else if (item > secondMax) {
                secondMax = item;
            }
        }

        return secondMax;
    }
}
