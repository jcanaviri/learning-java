package com.gm.pcworld;

@SuppressWarnings("unused")
public class InputDevice {
    private String inputType;
    private String mark;

    public InputDevice(String inputType, String mark) {
        this.inputType = inputType;
        this.mark = mark;
    }

    public String getInputType() {
        return this.inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getMark() {
        return this.mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "InputDevice {" + "inputType='" + inputType + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
