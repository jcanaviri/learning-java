package exceptionsmanage;

public class Arithmetic {
    public static int division(int a, int b) throws OwnException {
        if (b == 0)
            throw new OwnException("My message for zero division error");
        return a / b;
    }
}
