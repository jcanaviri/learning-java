package classes;

import java.util.Objects;

public class Person {
    // Class attributes
    String name;
    String lastName;

    public Person() {
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    // Class method
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
