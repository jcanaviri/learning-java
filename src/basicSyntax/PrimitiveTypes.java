package basicSyntax;

import java.util.Scanner;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // Byte type
        byte byteNumber = 10;
        System.out.println(byteNumber);
        System.out.println("Minimum value of a byte: " + Byte.MIN_VALUE);
        System.out.println("Maximum value of a byte: " + Byte.MAX_VALUE);

        // Short type
        short shortNumber = 10;
        System.out.println(shortNumber);
        System.out.println("Minimum value of a short: " + Short.MIN_VALUE);
        System.out.println("Maximum value of a short: " + Short.MAX_VALUE);

        // Integer type
        short integerNumber = 10;
        System.out.println(integerNumber);
        System.out.println("Minimum value of a integer: " + Integer.MIN_VALUE);
        System.out.println("Maximum value of a integer: " + Integer.MAX_VALUE);

        // Long type
        long longNumber = 10;
        System.out.println(longNumber);
        System.out.println("Minimum value of a long: " + Long.MIN_VALUE);
        System.out.println("Maximum value of a long: " + Long.MAX_VALUE);

        // Float type
        float floatNumber = 10.0f;
        System.out.println(floatNumber);
        System.out.println("Minimum value of a float: " + Float.MIN_VALUE);
        System.out.println("Maximum value of a float: " + Float.MAX_VALUE);

        // Double type
        double doubleNumber = 10.0;
        System.out.println(doubleNumber);
        System.out.println("Minimum value of a float: " + Double.MIN_VALUE);
        System.out.println("Maximum value of a float: " + Double.MAX_VALUE);

        // Character type
        char myCharacter = 'a';
        System.out.println("My char: " + myCharacter);

        // 33 is the unicode of '!' character
        char myCharacterDecimal = 33;
        System.out.println("My character decimal: " + myCharacterDecimal);

        // Boolean type
        boolean isAdult;
        boolean hasAccess;
        boolean canModify;

        Scanner sc = new Scanner(System.in);

        System.out.print("Is an adult?: ");
        isAdult = sc.nextBoolean();

        System.out.print("Has access?: ");
        hasAccess = sc.nextBoolean();

        System.out.print("Can modify?: ");
        canModify = sc.nextBoolean();

        if (isAdult && hasAccess && canModify)
            System.out.println("All values are true");
        else
            System.out.println("At least one value is false");

        // Type casting
        String ageString = "25";
        // This line will result as a:
        // -> The next year you will be 251 years old.
        System.out.println("The next year you will be " + (ageString + 1) + " years old.");
        // Now casting the type to an integer we can apply the addition operation like this:
        // -> The next year you will be 26 years old.
        int age = Integer.parseInt(ageString);
        System.out.println("The next year you will be " + (age + 1) + " years old.");

        String numberToText = String.valueOf(10);
        System.out.println("numberToText = " + numberToText);

        char firstChart = ageString.charAt(0);
        System.out.println("firstChart = " + firstChart);
    }
}
