package Polymorphism;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose a car type: (Enter E for a tesla), (Enter H for a Prius), or (Enter G for a chevy)" +
                ": ");
        String type = s.next();
        Object car = Car.getInstance(type);
      if (car instanceof ElectricCar) {
          ((ElectricCar) car).drive();
      } else if (car instanceof HybridCar hy) {
          hy.startEngine();
          hy.drive();
      } else if (car instanceof GasPoweredCar gas) {
          gas.startEngine();
          gas.drive();
      }

    }
}
