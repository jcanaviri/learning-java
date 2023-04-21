package dataStructures.stack;

public class Main {
    public static void main(String[] args) {
        // Creates a new stack of integers
        Stack<Integer> myStack = new Stack<>();
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(8);
        myStack.push(1);
        myStack.push(1);
        myStack.push(5);

        System.out.println("The length of the stack is: " + myStack.size());  // -> 7
        System.out.println(myStack);

        Integer top = myStack.pop();
        System.out.println("top = " + top);  // -> top = 5
        top = myStack.pop();
        System.out.println("top = " + top);  // -> top = 1

        System.out.println(myStack);

        System.out.println("The length of the stack is: " + myStack.size());  // -> 5
    }
}
