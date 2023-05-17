package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Main {

    public static Function<String, String> reverseWord = (word) -> {
        StringBuilder stringBuilder = new StringBuilder(word);
        return stringBuilder.reverse().toString();
    };

    public static void main(String[] args) {
        // Pure function
        System.out.println("Same inputs and same outputs");
        int result = add(2, 2);
        System.out.println("result = " + result);
        result = add(2, 2);
        System.out.println("result = " + result);

        // Impure function
        System.out.println("Save inputs and different outputs");
        int result2 = addV2(2, 2);
        System.out.println("result2 = " + result2);
        result2 = addV2(2, 2);
        System.out.println("result2 = " + result2);

        String reversed = reverseWord.apply("Hello");
        System.out.println("reversed = " + reversed);

        // A higher order function
        greet("Josue", reverseWord);
        greet("Josue", (x) -> x + "!!!");

        // Using the .stream method
        ArrayList<String> names = new ArrayList<>();
        names.add("James");
        names.add("Mary");
        names.add("Susan");

        names.forEach(System.out::println);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Integer result3 = numbers.stream()
                .map(x -> x + 1)
                .filter(x -> x % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println("result3 = " + result3);
    }

    // A pure function is a function that given some input it always returns the same value
    public static int add(int a, int b) {
        return a + b;
    }

    public static int addV2(int a, int b) {
        int randomNumber = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
        return a + b + randomNumber;
    }

    // Function that accepts a function
    public static void greet(String name, Function<String, String> foo) {
        String result = foo.apply(name);
        System.out.println("Hello, " + result);
    }
}
