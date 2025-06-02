package Restuarant;

import java.util.ArrayList;

public class MealOrder {
    private int numOfBurgers = 1;
    private int numOfDrinks = 1;
    private int numOfSideItems = 1;

    public MealOrder(){}

    public MealOrder(Hamburger hamburger, Drink drink){

    }
}

class Hamburger{
    private String type;
    private double price;
    private final String[] toppings = {"onion", "pickle", "tomato"};
    ArrayList<String> currentTopping = new ArrayList<>();

    public Hamburger(String type){
        switch (type){
            case "cheese" -> this.price = 3.99;
            case "veggie" -> this.price = 4.99;
            case "chicken" -> this.price = 5.99;
            default -> this.price = 2.99;
        }

    }

    public double getPrice(){
        return price;
    }

    public void addTopping(String topping){
        for (String top : toppings) {
            if (top.equals(topping)) {
                this.price += 0.50;
                currentTopping.add(topping);
                System.out.println(topping + " has been added to the burger");
            }
            System.out.printf("Unable to add that %s", topping);
        }
    }
}

class Drink{
    private double price;
    private String type;
    private String size;

    public Drink(){
        this.price = 0;
        this.size = "small";
        this.type = "water";
    }

    public Drink(double price, String type, String size){
        this.price = price;
        this.type = type;
        this.size = size;
    }

    private void setPrice(String size){
//        if ()
    }
}
