package abstracclass;

@SuppressWarnings("unused")
public class Triangle extends GeometricFigure {

    public final int b;
    public final int h;

    public Triangle(String figureType, int b, int h) {
        super(figureType);
        this.b = b;
        this.h = h;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + this.getClass().getSimpleName());
    }

    @Override
    public float getPerimeter() {
        return (float) (this.b + this.h) / 2;
    }

    @Override
    public float getArea() {
        return (float) 3.0 * this.b;
    }
}
