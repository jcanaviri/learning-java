package classes;

public class Box {
    public int height;
    public int width;
    public int deep;

    public Box() {
        System.out.println("Box Constructor Running");
    }

    public Box(int height, int width, int deep) {
        this();
        this.height = height;
        this.width = width;
        this.deep = deep;
    }

    public int getVolume() {
        return height * width * deep;
    }
}
