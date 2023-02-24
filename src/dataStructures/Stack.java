package dataStructures;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Stack {
    private final int[] items;
    private int top;
    private final static int MAX_SIZE = 10;

    public Stack() {
        this.items = new int[MAX_SIZE];
    }

    public boolean isEmpty() {
        return top == -1;
    }
    
    public void push(int value) {
        if (top == this.items.length - 1)
            throw new RuntimeException("Stack is full");
        top++;
        this.items[top] = value;
    }

    public int pop() {
        if (this.isEmpty())
            throw  new RuntimeException("Stack is full");
        int value = this.items[top];
        top--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return this.items[top];
    }

    public int size() {
        return top + 1;
    }

    @Override
    public String toString() {
        return "Stack{" + "items=" + Arrays.toString(this.items) +
                '}';
    }
}
