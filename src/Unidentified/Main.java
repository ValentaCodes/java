package Unidentified;

public class Main {
    public static void main(String[] args) {
//CustomerClass
        Customer customer1 = new Customer();
        System.out.println(customer1);
        System.out.println(customer1.getcreditLimit());
        Customer customer2 = new Customer("Cornelius Davis", "cdavis@rich.com");
        System.out.println(customer2);
        System.out.println(customer2.getName());
        Customer customer3 = new Customer("Cornelius Davis", "chadRichardson@rich.com", 1000000);
        System.out.println(customer3);
        System.out.println(customer3.getEmail());
    }
}