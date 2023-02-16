package codeblocks;

public class Dog {
    private static int dogCounter;
    private final int dogId;

    // This runs first when the class is loaded in memory
    static {
        System.out.println("Static block code");
        ++Dog.dogCounter;
    }

    // This every time an instance in created
    {
        System.out.println("non-static block");
        this.dogId = Dog.dogCounter++;
    }

    // This runs third
    public Dog() {
        System.out.println("Constructor run");
    }

    @Override
    public String toString() {
        return "Dog{" + "dogId=" + dogId +
                '}';
    }
}
