package com.gm.pcworld;

public class PCWorld {
    public static void main(String[] args) {
        Display myDisplay = new Display("Dell", 13);
        Keyboard myKeyboard = new Keyboard("bluetooth", "MSI");
        Mouse myMouse = new Mouse("bluetooth", "Asus");

        Computer myComputer = new Computer("Dell Laptop", myDisplay, myKeyboard, myMouse);

        Display yourDisplay = new Display("HP", 14);
        Keyboard yourKeyboard = new Keyboard("bluetooth", "HP");
        Mouse yourMouse = new Mouse("bluetooth", "HP");

        Computer yourComputer = new Computer("HP Laptop", yourDisplay, yourKeyboard, yourMouse);

        Order ourOrders = new Order();

        ourOrders.addComputer(myComputer);
        ourOrders.addComputer(yourComputer);

        ourOrders.showOrder();
    }
}
