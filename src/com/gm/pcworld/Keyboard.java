package com.gm.pcworld;

@SuppressWarnings("unused")
public class Keyboard extends InputDevice {
    private static int keyboardCounter;
    private final int keyboardId;

    public Keyboard(String inputType, String mark) {
        super(inputType, mark);
        this.keyboardId = ++Keyboard.keyboardCounter;
    }

    @Override
    public String toString() {
        return "Keyboard {" + "keyboardId=" + keyboardId +
                super.toString() +
                '}';
    }
}
