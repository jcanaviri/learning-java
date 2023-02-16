package generics;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer> integerGeneric = new GenericClass<>(42);
        integerGeneric.getType();

        GenericClass<String> stringGeneric = new GenericClass<>("hi");
        stringGeneric.getType();
    }
}
