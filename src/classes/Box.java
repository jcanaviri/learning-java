package classes;

public class Box {
    public int height;
    public int width;
    public int deep;

    public Box() {
    }

    public Box(int height, int width, int deep) {
        this.height = height;
        this.width = width;
        this.deep = deep;
    }

    public int getVolume() {
        return height * width * deep;
    }
}
