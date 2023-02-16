package exceptionsmanage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int number = sc.nextInt();
        int result;

        result = Arithmetic.division(42, number);
        System.out.println(result);

        sc.close();
    }
}
