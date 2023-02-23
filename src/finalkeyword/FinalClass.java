package finalkeyword;

// This class can't be inheritance from any other class
@SuppressWarnings("unused")
public final class FinalClass {
    // This is basically a constant in Java
    public final static int MY_CONSTANT = 3600;

    // * This function can't be overridden by any subclass
    // public final void show()...

    public void show() {
        System.out.println("Hello, World!");
    }
}
