package abstracclass;

/*
    In Java, an abstract class is a class that cannot be instantiated on its own but serves as a blueprint for other classes. It allows you to define methods with or without implementations that must be overridden by concrete subclasses. Abstract classes are often used to define a common interface or behavior that multiple related classes should share.
*/
@SuppressWarnings("unused")
public abstract class GeometricFigure {
    protected String figureType;

    protected GeometricFigure(String figureType) {
        this.figureType = figureType;
    }

    // This method should be implemented by the classes that inherit from GeometricFigure
    public abstract void draw();

    // This method should be implemented by the classes that inherit from GeometricFigure
    public abstract float getPerimeter();

    // This method should be implemented by the classes that inherit from GeometricFigure
    public abstract float getArea();

    public String getFigureType() {
        return this.figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    @Override
    public String toString() {
        return "GeometricFigure{" + "figureType='" + figureType + '\'' +
                '}';
    }
}
