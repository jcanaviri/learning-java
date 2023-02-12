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
    }
}
