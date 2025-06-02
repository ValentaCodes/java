package Restuarant;

public class Main {
    public static void main(String[] args) {
        MealOrder order1 = new MealOrder();
        Hamburger cheeseBurger = new Hamburger("mushroom");
        System.out.println(cheeseBurger.getPrice());
    }
}
