package staticcontext;

@SuppressWarnings("unused")
public class Person {
    private static int personCounter;
    private final int personId;
    private String name;

    public Person(String name) {
        this.name = name;

        // Increment the person counter
        Person.personCounter++;

        // set the person id
        this.personId = Person.personCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + this.personId +
                ", name='" + this.name + '\'' +
                '}';
    }
}
