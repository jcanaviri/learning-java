package staticcontext;

public class Person {
    private static int personCounter;
    private int personId;
    private String name;

    public Person(String name) {
        this.name = name;

        // Increment the person counter
        Person.personCounter++;

        // set the person id
        this.personId = Person.personCounter;
    }

    public static int getPersonCounter() {
        return personCounter;
    }

    public static void setPersonCounter(int personCounter) {
        Person.personCounter = personCounter;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }
}
