package inherance;

public class Main {
    public static void main(String[] args) {
        Employee mike = new Employee("Michael", 3500);
        System.out.println("mike = " + mike);

        Customer tommy = new Customer("Tommy", 'M', 18, "Oak #123", false);
        System.out.println("tommy = " + tommy);
    }
}
