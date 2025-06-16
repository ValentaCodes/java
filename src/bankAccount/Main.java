package bankAccount;

public class Main {
    public static void main(String[] args) {
        Account ac1 = new Account("Cornelius", "Davis", 1232354, 100000);
        System.out.println(ac1);
        ac1.withdrawal(60000);
        System.out.println(ac1);
    }
}
