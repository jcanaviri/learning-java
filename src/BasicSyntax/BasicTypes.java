package BasicSyntax;

public class BasicTypes {
    public static void main(String[] args) {
        // Declaring an integer variable
        int myIntegerVariable = 42;
        System.out.println(myIntegerVariable);

        // Modifying a variable
        myIntegerVariable = 10;
        System.out.println(myIntegerVariable);

        // Declaring a string
        String myStringVariable = "Greetings";
        System.out.println(myStringVariable);

        myStringVariable = "Bolivia";
        System.out.println(myStringVariable);

        // How to know the type of variable
        String variableType = myStringVariable.getClass().getSimpleName();
        System.out.println("The type of myStringVariable is: " + variableType);

        // var - resolves the type of the variable itself
        var myInt = 10;
        System.out.println(myInt);
        System.out.println("myInt = " + myInt);

        // Concatenation
        var user = "Josue";
        var degree = "Engineer";

        var union = degree + " " + user;
        System.out.println(union);

        // Special characters
        System.out.println("Your name is: \n" + user);
        System.out.println("Your name is: \t" + user);
        System.out.println("Your name is: \b\b" + user);
    }
}
