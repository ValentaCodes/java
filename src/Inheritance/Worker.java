package Inheritance;

/**
 * @author corneliusdavis
 * @version 06/30/25
 * A class object that represents a "Worker" in a company structure
 */
public class Worker {
    private String name;
    private String birthdate;
    //using the protected access modifier will allow us to access this variable in subclasses and/or other packages.
    protected String endDate;

    public Worker(){}

    public Worker(String name, String birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }

    public int getAge(){
        int birthYear = 2025;
        return birthYear - Integer.parseInt(this.birthdate.substring(6));
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "endDate='" + endDate + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
