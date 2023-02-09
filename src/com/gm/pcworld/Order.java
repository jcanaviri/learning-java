package com.gm.pcworld;

public class Order {
    private final int orderId;
    public final Computer[] computers;
    private static int orderCounter;
    private static final int MAX_COMPUTERS = 5;
    private int computerCounter;

    public Order() {
        this.orderId = ++Order.orderCounter;
        this.computers = new Computer[MAX_COMPUTERS];
    }

    public void addComputer(Computer computer) {
        if (this.orderId < Order.MAX_COMPUTERS)
            this.computers[this.computerCounter++] = computer;
        else
            System.out.println("Limit has been exceeded: " + Order.MAX_COMPUTERS + " MAX_COMPUTERS");
    }

    public void showOrder() {
        System.out.println("Order # " + this.orderId);
        System.out.println("Computers:");
        for (Computer c : this.computers) {
            if (c != null)
                System.out.println(c);
        }
    }
}
