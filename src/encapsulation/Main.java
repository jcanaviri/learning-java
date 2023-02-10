package encapsulation;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John", 5000, false);
        System.out.println(john);
        System.out.println("john name = " + john.getName());

        john.setName("Harry");
        john.setSalary(9000);

        System.out.println("john name = " + john.getName());
        System.out.println(john);

        System.out.println("john salary = " + john.getSalary());
        john.setSalary(10000);
        System.out.println("john salary = " + john.getSalary());

        john.setDeleted(false);
        System.out.println("john is deleted = " + john.isDeleted());
    }
}
