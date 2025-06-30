package Inheritance;

/**
 * @author corneliusdavis
 * @version 06/30/2025
 * This class object represents a salaried employee at a company
 */
public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthdate, long employeeId, String hireDate){
        super(name, birthdate, employeeId, hireDate);
    }
    public SalariedEmployee(double annualSalary, boolean isRetired){
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        super.endDate = "2025";
        System.out.println(endDate);
    }
}
