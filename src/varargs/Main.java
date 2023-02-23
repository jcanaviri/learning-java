package varargs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        showNumbers(1, 2, 3, 4);
        showNumbers(17, 22);

        manyParams("Josue", 5, 4, 3);
        manyParams("Samanta", 3, 2, 1);
    }

    private static void manyParams(String name, int... numbers) {
        System.out.println("name = " + name);
        showNumbers(numbers);
    }

    private static void showNumbers(int... numbers) {
        Arrays.stream(numbers)
                .forEach(System.out::println);
    }
}
