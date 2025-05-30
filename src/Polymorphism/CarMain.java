package Polymorphism;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose a car type: (Enter E for a tesla), (Enter H for a Prius), or (Enter G for a chevy)" +
                ": ");
        String type = s.next();
        var car = Car.getInstance(type);
        s.close();
        switch (car) {
            case ElectricCar ev -> {
                ev.getDescription();
                ev.startEngine();
                ev.drive();
            }
            case HybridCar hy -> {
                hy.getDescription();
                hy.startEngine();
                hy.drive();
            }
            case GasPoweredCar gas -> {
                gas.getDescription();
                gas.startEngine();
                gas.drive();
            }
            default -> {
            }
        }
    }
}
