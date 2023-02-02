package inherance;

public class Employee extends Person {
    private static int employeeCounter;
    private int idEmployee;
    private double salary;

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
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("idEmployee=").append(idEmployee);
        sb.append(", salary=").append(salary);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
