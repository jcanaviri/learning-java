package varargs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n1-4: ");
        showNumbers(1, 2, 3, 4);

        System.out.println("\n17-22: ");
        showNumbers(17, 22);

        manyParams("Josue", 5, 4, 3);
        manyParams("Sarah", 3, 2, 1, 0);
    }

    private static void manyParams(String name, int... numbers) {
        System.out.println("\nname = " + name);
        showNumbers(numbers);
    }

    // Prints all the given numbers
    private static void showNumbers(int... numbers) {
        Arrays.stream(numbers)
                .forEach(System.out::print);
    }
}
