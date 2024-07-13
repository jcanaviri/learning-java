package generics;

public class GenericClass<T> {
    private final T object;

    public GenericClass(T object) {
        this.object = object;
    }

    public void getType() {
        System.out.println("Type = " + this.object.getClass().getSimpleName());
    }
}
