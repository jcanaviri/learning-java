package com.gm.pcworld;

@SuppressWarnings("unused")
public class Display {
    private final int displayId;
    private String mark;
    private double size;
    private static int displayCounter;

    public Display() {
        this.displayId = ++Display.displayCounter;
    }
    public Display(String mark, double size) {
        this();
        this.mark = mark;
        this.size = size;
    }

    public int getDisplayId() {
        return this.displayId;
    }

    public String getMark() {
        return this.mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Display{" + "displayId=" + displayId +
                ", mark='" + mark + '\'' +
                ", size=" + size +
                '}';
    }
}
