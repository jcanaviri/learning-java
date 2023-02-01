package classes;

public class Main {
    public static void main(String[] args) {
        // Using the arithmetic class
        Arithmetic a1 = new Arithmetic();
        System.out.println(a1.a);
        System.out.println(a1.b);

        Arithmetic a2 = new Arithmetic(4, 3);
        System.out.println(a2.a);
        System.out.println(a2.b);

        // Class box
        Box myBox = new Box(3, 2, 6);
        System.out.println("The volume is: " + myBox.getVolume());

        // Pass argument by value
        // the value doesn't change because it's a primitive type
        int x = 42;
        System.out.println("x = " + x);  // -> 42

        passByValue(x);
        System.out.println("x = " + x);  // -> 42

        // Pass argument by reference
        Person john = new Person();
        john.name = "John";
        john.lastName = "Doe";
        System.out.println(john.name);
        System.out.println(john.lastName);

        passByReference(john);
        System.out.println(john.name);
        System.out.println(john.lastName);

        // This will show the memory address of the object
        // (e. g.) -> classes.Person@3feba861
        System.out.println(john);
    }

    public static void passByValue(int arg1) {
        // This value can't change
        arg1 = 17;
    }

    public static void passByReference(Person somePerson) {
        // This value will change
        somePerson.name = "Susan";
        somePerson.lastName = "Smith";
    }
}
