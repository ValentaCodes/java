package Inheritance;

/**
 * @author corneliusdavis
 * @version 06/30/2025
 * This subclass object extends the Worker class and represents an Employee
 */
public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public Employee(){}

    public Employee(String name, String birthdate, long employeeId, String hireDate){
        super(name, birthdate);
        this.employeeId = employeeId;
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
