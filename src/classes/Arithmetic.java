package classes;

public class Arithmetic {
    int a;
    int b;

    public void add() {
        int result = this.a + this.b;
        System.out.println("result = " + result);
    }

    public int addWithReturn() {
        return this.a + this.b;
    }

    public int addWithArguments(int val1, int val2) {
        this.a = val1;
        this.b = val2;
        return this.a + this.b;
    }
}
