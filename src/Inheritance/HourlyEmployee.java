package Inheritance;

/**
 * @author corneliusdavis
 * @version 06/30/2025
 * This class object represents an hourly employee for a company
 */
public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthdate, String hireDate, double hourlyPayRate) {
        super(name, birthdate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){
        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){
       return 2 * collectPay();
    }
}
