package dataStructures;

@SuppressWarnings("unused")
public class Node<T> {
    public final T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}
