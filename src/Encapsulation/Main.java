package Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player playerOne = new Player("Tim");
//        System.out.println("initial health: " + playerOne.healthRemaining());
        Printer printer1 = new Printer(50, true);
        System.out.println(printer1.getPagesPrinted());
        printer1.printPages(10);
        System.out.println(printer1.getPagesPrinted());
    }
}
