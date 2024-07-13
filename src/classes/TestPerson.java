package classes;

public class TestPerson {
    public static void main(String[] args) {
        Person john = new Person();
        john.firstName = "John";
        john.lastName = "Snow";

        john.showInfo();
    }
}
