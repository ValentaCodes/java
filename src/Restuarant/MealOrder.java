package Restuarant;

import java.util.ArrayList;
import java.util.Scanner;

public class MealOrder {
    Hamburger hamburger;
    Drink drink;
    SideItem sideItem;

    public MealOrder() {
        this.hamburger = new Hamburger();
        this.drink = new Drink();
        this.sideItem = new SideItem();
    }

}

class Hamburger {
    String[] toppings = new String[]{"tomato", "lettuce", "onion"};
    ArrayList<String> currentTopping = new ArrayList<>(3);
    private String type;
    private double price;

    public Hamburger() {
        this.price = 2.99;
        this.type = "plain";
    }

    public void setHamburger(String type) {
        switch (type) {
            case "cheese" -> {
                this.price = 3.99;
                this.type = "cheese";
            }
            case "veggie" -> {
                this.price = 4.99;
                this.type = "veggie";
            }
            case "mushroom" -> {
                this.price = 5.99;
                this.type = "mushroom";
            }
        }
    }

    public double getPrice() {
        return price;
    }

//    public static Hamburger getHamburger(String type) {
//        return switch (type.toUpperCase().charAt(0)) {
//            case 'C' -> new Hamburger("cheese");
//            case 'V' -> new Hamburger("veggie");
//            case 'M' -> new Hamburger("mushroom");
//            default -> new Hamburger("plain");
//        };
//    }

    public void addTopping() {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose a topping: " + String.join(", ", toppings));
        String topping = s.next();
        s.close();
        for (String top : toppings) {
            if (currentTopping.size() >= 3) {
                System.out.println("You have reached the maximum number of toppings for this burger");
                break;
            }
            if (top.equals(topping)) {
                this.price += 0.50;
                currentTopping.add(topping);
                System.out.println(topping + " has been added to the burger");
            }
        }
    }

    public String getType() {
        return type;
    }

    public ArrayList<String> getCurrentTopping() {
        return currentTopping;
    }
}

class Drink {
    private double price;
    private String type;
    private String size;

    public Drink() {
        this.price = 0;
        this.size = "small";
        this.type = "water";
    }

    public Drink(String size, String type, double price) {
        this.size = size;
        this.type = type;
        this.price = price;
    }

    private Drink setDrinkType(String size) {
        Scanner s = new Scanner(System.in);
        System.out.println("Water or soda?: ");
        String type = s.next();
        s.close();
        return switch(size.toUpperCase().charAt(0)) {
            case 'S' -> {
                this.price = 1.00;
                if (type.contains("soda")) {
                    this.price += .50;
                }
                yield new Drink("small", type, price);
            }
            case 'M' -> {
                this.price = 2.00;
                if (type.contains("soda")) {
                    this.price += .50;
                }
                yield new Drink("medium", type, price);
            }
            case 'L' -> {
                this.price = 3.00;
                if (type.contains("soda")) {
                    this.price += .50;
                }
               yield new Drink("large", type, price);
            }
            default -> new Drink();
        };
    }
}

class SideItem {
    private String type;
    private double price;

    public SideItem(){
        this.type = "fries";
        this.price = 2.00;
    }

}
