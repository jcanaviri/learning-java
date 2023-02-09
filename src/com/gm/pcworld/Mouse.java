package com.gm.pcworld;

public class Mouse extends InputDevice {
    private final int mouseId;

    private static int mouseCounter;

    public Mouse(String inputType, String mark) {
        super(inputType, mark);
        this.mouseId = ++Mouse.mouseCounter;
    }

    public int getMouseId() {
        return this.mouseId;
    }

    @Override
    public String toString() {
        return "Mouse {" + ", mouseId = " + this.mouseId +
                super.toString() +
                '}';
    }
}
