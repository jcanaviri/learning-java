package inherance;

public class Person {
    protected String name;
    protected char genre;
    protected int age;
    protected String address;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, char genre, int age, String address) {
        this.name = name;
        this.genre = genre;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGenre() {
        return this.genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
