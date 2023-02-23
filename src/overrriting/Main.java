package overrriting;

public class Main {
    public static void main(String[] args) {
        Manager german = new Manager("German", 5000, "Software");

        System.out.println(german.getSalary());
        german.setSalary(7000);
        System.out.println(german.getSalary());

        german.setDepartment("New Department");
        System.out.println(german.getDepartment());

        System.out.println(german.getDetails());

        // Instance of
        Employee jack = new Employee("Jack", 200);
        System.out.println("jack = " + jack);

        // * Determinate the type with instanceof
        // System.out.println(jack instanceof Employee);
        // -> true

        // System.out.println(jack instanceof Object);
        // -> true
    }
}
