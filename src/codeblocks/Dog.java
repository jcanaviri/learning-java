package codeblocks;

public class Dog {
    private static int dogCounter;

    // This runs first when an instance is created
    static {
        System.out.println("Static block code");
        ++Dog.dogCounter;
    }

    private final int dogId;

    // This runs second
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
