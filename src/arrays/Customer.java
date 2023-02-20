package arrays;

import java.util.StringJoiner;

@SuppressWarnings("unused")
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Customer.class.getSimpleName() + "{", "}")
                .add("name='" + name + "'")
                .toString();
    }
}
