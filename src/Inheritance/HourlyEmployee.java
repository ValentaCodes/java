package Inheritance;

/**
 * @author corneliusdavis
 * @version 06/30/2025
 * This class object represents an hourly employee for a company
 */
public class HourlyEmployee extends Employee {
    private final double hourlyPayRate;

    public HourlyEmployee(){
        this(40.00);
    }

    public HourlyEmployee(double hourlyPayRate){
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay(){
        System.out.println(hourlyPayRate * 2);
    }
}
