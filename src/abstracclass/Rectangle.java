package abstracclass;

// Rectangle inherits from GeometricFigure
// that means this class should implement the abstract methods

@SuppressWarnings("unused")
public class Rectangle extends GeometricFigure {
    public final int a;
    public final int b;

    public Rectangle(String figureType, int a, int b) {
        super(figureType);
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + this.getClass().getSimpleName());
    }

    @Override
    public float getPerimeter() {
        return (float) 2 * (this.a + this.b);
    }

    @Override
    public float getArea() {
        return this.a * this.b;
    }
}
