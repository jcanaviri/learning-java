package encapsulation;

public class Person {
    private String name;
    private double salary;
    private boolean isDeleted;

    public Person(String name, double salary, boolean isDeleted) {
        this.name = name;
        this.salary = salary;
        this.isDeleted = isDeleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
