package Inheritance;

/**
 * @author corneliusdavis
 * @version 06/30/2025
 * This subclass object extends the Worker class and represents an Employee
 */
public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    //Remember a static field is a place where you can share data across all instances.
    private static int employeeNo = 1;

    public Employee(){}

    public Employee(String name, String birthdate, String hireDate){
        super(name, birthdate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
