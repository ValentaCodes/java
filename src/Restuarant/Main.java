package Restuarant;

public class Main {
    public static void main(String[] args) {
    MealOrder meal1 = new MealOrder();
        meal1.hamburger.setHamburger("cheese");
        System.out.println(meal1.hamburger.getType());
    }
}
