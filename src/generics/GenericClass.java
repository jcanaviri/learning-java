package generics;

@SuppressWarnings("unused")
public class GenericClass<T> {
    private T object;

    public GenericClass(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void getType() {
        System.out.println("The type of T is: " + this.object.getClass().getSimpleName());
    }
}
