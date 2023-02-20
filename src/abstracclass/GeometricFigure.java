package abstracclass;

@SuppressWarnings("unused")
public abstract class GeometricFigure {
    protected String figureType;

    protected GeometricFigure(String figureType) {
        this.figureType = figureType;
    }

    // This method should be implemented by the classes that inherit from it
    public abstract void draw();

    public String getFigureType() {
        return figureType;
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
