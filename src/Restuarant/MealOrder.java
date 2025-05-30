package Restuarant;

public class MealOrder {
    private int numOfBurgers = 1;
    private int numOfDrinks = 1;
    private int numOfSideItems = 1;

    public MealOrder(){}
}

class Hamburger{
    private boolean cheese = false;
    private boolean onion = false;
    private double price = 2.99;

    public Hamburger(){}

    public Hamburger(boolean cheese){
        this.cheese = cheese;
        this.price = (cheese ? 4.99 : price);
    }

    public double getPrice(){
        return price;
    }
}
