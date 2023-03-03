package abstracclass;

public class Main {
    public static void main(String[] args) {
        GeometricFigure r1 = new Rectangle("rectangle", 3, 5);
        r1.draw();
        System.out.println("Perimeter: " + r1.getPerimeter() + "units.");
        System.out.println("Area: " + r1.getArea() + " units^2.");

        GeometricFigure c1 = new Rectangle("square", 5, 5);
        c1.draw();
        System.out.println("Perimeter: " + c1.getPerimeter() + "units.");
        System.out.println("Area: " + c1.getArea() + " units^2.");
    }
}
