package Unidentified;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, String email, double creditLimit){
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public Customer(String name, String email){
        this(name, email, 10000.00);
    }

    public Customer(){
        this("Default name", "default@email.com", 10000.00);
    }

    public String getName(){return name;}
    public double getcreditLimit(){return creditLimit;}
    public String getEmail(){return email;}

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", email='" + email + '\'' +
                '}';
    }
}
