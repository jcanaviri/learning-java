package classes;

public class TestEquals {
    public static void main(String[] args) {
        Person p1 = new Person("John", "Snow");
        Person p2 = new Person("John", "Snow");

        // * When I use == to compare the compilation throws a warning

        if (p1.equals(p2))
            System.out.println("Equals using .equals()");
        else
            System.out.println("Not equals using .equals()");

        if (p1.hashCode() == p2.hashCode())
            System.out.println("The hashcode value is the same");
        else
            System.out.println("The hashcode value is not the same");
    }
}
