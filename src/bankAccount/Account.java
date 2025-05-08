package bankAccount;

public class Account {
    private double balance;
    private long accountNum;
    private String Fname;
    private String Lname;

    public Account(String Fname, String Lname, long accountNum, double balance) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.accountNum = accountNum;
        this.balance = balance;
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

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public void withdrawal(int amount){
        this.balance -= amount;
    }

    @Override
    public String toString(){
        return "Account Information: { " +
                this.Fname +
                " " +
                this.Lname +
                ", " +
                this.accountNum +
                ", " +
                this.balance +
                "}";

    }

}
