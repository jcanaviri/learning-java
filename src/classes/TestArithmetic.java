package classes;

public class TestArithmetic {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.a = 3;
        arithmetic.b = 2;

        arithmetic.add();

        int result = arithmetic.addWithReturn();
        System.out.println("result = " + result);

        int anotherResult = arithmetic.addWithArguments(6, 2);
        System.out.println("anotherResult = " + anotherResult);
    }
}
