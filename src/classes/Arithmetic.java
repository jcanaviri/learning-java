package classes;

public class Arithmetic {
    int a;
    int b;

    // Constructor without parameters
    public Arithmetic() {
        System.out.println("Running the constructor");
    }

    // Constructor with parameters
    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // A method called add
    public void add() {
        int result = this.a + this.b;
        System.out.println("result = " + result);
    }

    // Another method called add2
    public int add2() {
        return this.a + this.b;
    }

    // Another method called add3
    public int add3(int a, int b) {
        this.a = a;
        this.b = b;

        return this.add2();
    }
}
