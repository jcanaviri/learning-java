package abstracclass;

// An abstract class define methods that should be implemented
// by the classes that inherit from the class

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
