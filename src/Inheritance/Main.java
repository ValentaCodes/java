package Inheritance;

public class Main {
    public static void main(String[] args) {
        Employee bo = new Employee("bo", "10/21/1996", "06/30/2025");
        Employee john = new Employee("john", "10/21/1996", "06/30/2025");
        SalariedEmployee joe = new SalariedEmployee("Joe", "10/03/1993", "06/12/2025", 100000);
        HourlyEmployee mary = new HourlyEmployee("Mary", "05/12/1983", "10/23/2004", 20);
        System.out.println(bo);
        System.out.println(john);
        System.out.println(joe);
        System.out.println(mary);
        System.out.println("Mary's double pay = $" + mary.getDoublePay());
        joe.retire();
        System.out.println("Joe's paycheck = $" + joe.collectPay());
    }
}