import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World ✨");

        // Creating a variable
        int myIntegerVariable = 42;
        System.out.println("myIntegerVariable = " + myIntegerVariable);

        // Updating a variable
        myIntegerVariable = 24;
        System.out.println("myIntegerVariable = " + myIntegerVariable);

        String myStringVariable = "Hello";
        System.out.println("myStringVariable = " + myStringVariable);

        myStringVariable = "Goodbye";
        System.out.println("myStringVariable = " + myStringVariable);

        // Using the keyword 'var'
        var myVariable = 15;
        System.out.println("myVariable = " + myVariable);

        // Concatenation
        var user = "John";
        var degree = "Engineer";
        var union = degree + " " + user;
        System.out.println("union = " + union);

        // The multiplication goes first
        System.out.println(2 + 2 * 9);

        // Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Tell me your name: ");
        String name = input.nextLine();
        System.out.println("So, you are " + name + " nice to meet you!");
    }
}
