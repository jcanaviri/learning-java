package com.gm.pcworld;

@SuppressWarnings("unused")
public class Computer {
    private final int computerId;
    private String name;
    private Display display;
    private Keyboard keyboard;
    private Mouse mouse;
    private static int computerCounter;

    public Computer() {
        this.computerId = ++Computer.computerCounter;
    }

    public Computer(String name, Display display, Keyboard keyboard, Mouse mouse) {
        this();
        this.name = name;
        this.display = display;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public int getComputerId() {
        return this.computerId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Display getDisplay() {
        return this.display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return this.keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return this.mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computer{" + "computerId=" + computerId +
                ", name='" + name + '\'' +
                ", display=" + display +
                ", keyboard=" + keyboard +
                ", mouse=" + mouse +
                '}';
    }
}
