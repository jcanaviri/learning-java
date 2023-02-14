package abstracclass;

public class Rectangle extends GeometricFigure {
    public Rectangle(String figureType) {
        super(figureType);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + this.getClass().getSimpleName());
    }
}
