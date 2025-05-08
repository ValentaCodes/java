package bankAccount;

public class Main {
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.setFname("Cornelius");
        ac1.setLname("Davis");
        ac1.setBalance(80000);
        ac1.setAccountNum(293842398);
        System.out.println(ac1);
        ac1.withdrawal(60000);
        System.out.println(ac1);
    }
}
