package dataStructures;

import java.util.EmptyStackException;

@SuppressWarnings("unused")
public class Stack<T> {
    private Node<T> top;
    private int size;

    public Stack() {
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = this.top;
        this.top = newNode;
        this.size++;
    }

    public T pop() {
        if (this.isEmpty())
            throw new EmptyStackException();
        T value = this.top.data;
        this.top = this.top.next;
        this.size--;

        return value;
    }

    public T peek() {
        if (this.isEmpty())
            throw new EmptyStackException();
        return this.top.data;
    }

}
