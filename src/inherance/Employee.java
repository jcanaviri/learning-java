package inherance;

@SuppressWarnings("unused")
public class Employee extends Person {
    private static int employeeCounter;
    private int idEmployee;
    private double salary;

    // Overloading the constructor
    public Employee() {
        this.idEmployee = ++Employee.employeeCounter;
    }

    public Employee(String name, double salary) {
        super(name);
        this.idEmployee = ++Employee.employeeCounter;
        this.salary = salary;
    }

    public int getIdEmployee() {
        return this.idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "idEmployee=" + idEmployee +
                ", salary=" + salary +
                ", " + super.toString() +
                '}';
    }
}
