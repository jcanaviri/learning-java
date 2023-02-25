package dataStructures.stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(8);
        myStack.push(1);
        myStack.push(1);
        myStack.push(5);

        System.out.println("The length of the stack is: " + myStack.size());
        System.out.println(myStack);

        Integer top = myStack.pop();
        System.out.println("top = " + top);
        top = myStack.pop();
        System.out.println("top = " + top);

        System.out.println(myStack);

        System.out.println("The length of the stack is: " + myStack.size());
    }
}
