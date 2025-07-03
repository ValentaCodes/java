package Inheritance;

/**
 * @author corneliusdavis
 * @version 06/30/2025
 * This class object represents a salaried employee at a company
 */
public class SalariedEmployee extends Employee {
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthdate, String hireDate, double annualSalary){
        super(name, birthdate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire(){
        terminate("12/12/2025");
        this.isRetired = true;
    }

    @Override
    public double collectPay(){
        double paycheck = annualSalary / 26;
        return (isRetired) ? 0.9 * paycheck : paycheck;
    }
}
