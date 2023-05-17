package abstracclass;

public class Main {
    public static void main(String[] args) {
        // Create a new rectangle called 'r1'
        GeometricFigure r1 = new Rectangle("rectangle", 3, 5);
        r1.draw();
        System.out.println("Perimeter: " + r1.getPerimeter() + " units.");
        System.out.println("Area: " + r1.getArea() + " units^2.");

        // Create a new rectangle called 'c1'
        GeometricFigure c1 = new Rectangle("square", 5, 5);
        c1.draw();
        System.out.println("Perimeter: " + c1.getPerimeter() + " units.");
        System.out.println("Area: " + c1.getArea() + " units^2.");

        // Create a new triangle called 't1'
        GeometricFigure t1 = new Triangle("triangle", 10, 14);
        t1.draw();
        System.out.println("Perimeter " + t1.getPerimeter() + " units.");
        System.out.println("Area: " + t1.getArea() + " units^2");
    }
}
