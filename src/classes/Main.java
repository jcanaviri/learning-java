package classes;

public class Main {
    public static void main(String[] args) {
        // Using the arithmetic class
        Arithmetic a1 = new Arithmetic();
        System.out.println("a1.a = " + a1.a);
        System.out.println("a1.b = " + a1.b);

        Arithmetic a2 = new Arithmetic(4, 3);
        System.out.println("a2.a = " + a2.a);
        System.out.println("a2.b = " + a2.b);

        // Using the add, add2, add3 methods
        a2.add();
        System.out.println(a2.add2()); // this case we already have a and b values set
        System.out.println(a1.add3(2, 3));  // this case no, so we have to give a and b values

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
        john.showInfo();

        passByReference(john);
        System.out.println(john.name);
        System.out.println(john.lastName);

        // This will show the memory address of the object
        // (e.g.) -> classes.Person@3feba861
        System.out.println(john);
    }

    public static void passByValue(int arg1) {
        // This value can't change
        // arg1 = 17;
        System.out.println(arg1);
    }

    public static void passByReference(Person somePerson) {
        // This value will change
        somePerson.name = "Susan";
        somePerson.lastName = "Smith";
    }
}
