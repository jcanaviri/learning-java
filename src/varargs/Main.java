package varargs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        showNumbers(1, 2, 3, 4);
        showNumbers(17, 22);

        manyParams("Josue", 5, 4, 3);
    }

    private static void manyParams(String name, int... numbers) {
        System.out.println("name = " + name);
        showNumbers(numbers);
    }

    private static void showNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
