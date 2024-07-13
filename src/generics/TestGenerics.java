package generics;

public class TestGenerics {
    public static void main(String[] args) {
        GenericClass<Integer> object = new GenericClass<>(14);
        object.getType();

        GenericClass<String> object2 = new GenericClass<>("No Game, No Life");
        object2.getType();
    }
}
