package casting;

import overrriting.Employee;

public class Writer extends Employee {
    final WriteType writeType;

    public Writer(String name, double salary, WriteType writeType) {
        super(name, salary);
        this.writeType = writeType;
    }

    public String getDetails() {
        return super.getDetails() + ", writing type: " + this.writeType;
    }
}
