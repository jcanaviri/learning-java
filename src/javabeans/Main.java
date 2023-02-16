package javabeans;

public class Main {
    public static void main(String[] args) {
        Person somePerson = new Person();

        somePerson.setName("John");
        somePerson.setLastName("Snow");

        System.out.println("somePerson = " + somePerson);
    }
}
