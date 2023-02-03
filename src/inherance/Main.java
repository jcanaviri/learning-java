package inherance;

public class Main {
    public static void main(String[] args) {
        Employee mike = new Employee("Michael", 3500);
        System.out.println("mike = " + mike);

        Customer tommy = new Customer("Tommy", 'M', 18, "Oak #123", false);
        System.out.println("tommy = " + tommy);

        System.out.println("add(2, 4) = " + add(2, 4));
        System.out.println("add(2.5, 4.5) = " + add(2.5, 4.5));
        System.out.println("add(2, 4L) = " + add(2, 4L));
    }

    // Examples of overload in functions
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
}
