package javabeans;

import java.io.Serializable;

@SuppressWarnings("unused")
public class Person implements Serializable {
    private String name;
    private String lastName;

    public Person() {
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
