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

        /*Scanner input = new Scanner(System.in);

        System.out.print("Tell me your name: ");
        String name = input.nextLine();
        System.out.println("So, you are " + name + " nice to meet you!");*/

        // Primitive types
        byte myByte = 127;
        System.out.println("myByte = " + myByte);
        System.out.println("Max value of byte: " + Byte.MAX_VALUE);
        System.out.println("Min value of byte: " + Byte.MIN_VALUE);

        short myShort = 10;
        System.out.println("myShort = " + myShort);
        System.out.println("Max value of short: " + Short.MAX_VALUE);
        System.out.println("Max value of short: " + Short.MIN_VALUE);

        int myInt = 10;
        System.out.println("myInt = " + myInt);
        System.out.println("Max value of int: " + Integer.MAX_VALUE);
        System.out.println("Max value of int: " + Integer.MIN_VALUE);

        long myLong = 10;
        System.out.println("myLong = " + myLong);
        System.out.println("Max value of long: " + Long.MAX_VALUE);
        System.out.println("Max value of long: " + Long.MIN_VALUE);

        float myFloat = 10.0F;
        System.out.println("myFloat = " + myFloat);
        System.out.println("Max value of float: " + Float.MAX_VALUE);
        System.out.println("Max value of float: " + Float.MIN_VALUE);

        double myDouble = 42;
        System.out.println("myDouble = " + myDouble);
        System.out.println("Max value of double: " + Double.MAX_VALUE);
        System.out.println("Max value of double: " + Double.MIN_VALUE);

        var integerWithVar = 10.0;
        System.out.println("integerWithVar = " + integerWithVar);

        char letter = 'w';
        System.out.println("letter = " + letter);

        var anotherLetter = '#';
        System.out.println("anotherLetter = " + anotherLetter);

        boolean isValid = false;
        if (isValid) System.out.println("Granted");
        else System.out.println("Access Denied");

        // Type conversion
        var age = Integer.parseInt("19");
        System.out.println("age = " + age);

        var pi = Double.parseDouble("3.1416");
        System.out.println("pi = " + pi);
    }
}
