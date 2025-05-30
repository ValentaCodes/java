package Restuarant;

public class Main {
    public static void main(String[] args) {
        MealOrder order1 = new MealOrder();
        Hamburger cheeseBurger = new Hamburger(true);
        System.out.println(cheeseBurger.getPrice());
        System.out.println(order1);
    }
}
