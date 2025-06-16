package bankAccount;

public class Account {
    private double balance;
    private long accountNum;
    private String fName;
    private String lName;
    private String customerName;

    public Account(String fName, String lName, long accountNum, double balance) {
        this.fName = fName;
        this.lName = lName;
        this.accountNum = accountNum;
        this.balance = balance;
        customerName = fName + " "  + lName;
    }

    public Account() {

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(long accountNum) {
        this.accountNum = accountNum;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fname) {
        fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        lName = lName;
    }

    public void withdrawal(int amount){
        this.balance -= amount;
    }

    @Override
    public String toString(){
        return "Account Information: { " +
                customerName +
                ", " +
                this.accountNum +
                ", " +
                this.balance +
                "}";

    }

}
