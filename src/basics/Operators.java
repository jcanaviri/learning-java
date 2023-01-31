package basics;

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
        String mySecondString = "Hello";

        System.out.println(myFirstString == mySecondString);
        System.out.println(myFirstString.equals(mySecondString));

        // The ternary operator
        String result = (3 > 2) ? "yes" : "no";
        System.out.println(result);
    }
}
