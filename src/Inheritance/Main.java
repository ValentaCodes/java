package Inheritance;

public class Main {
    public static void main(String[] args) {
    Employee bo = new Employee("bo", "10/21/1996", 1, "06/30/2025");
        System.out.println(bo);
        System.out.println("Age= " + bo.getAge());
        System.out.println("Payout= " + bo.collectPay());
    }
}