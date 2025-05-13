package Unidentified;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(8));
    }
    // I created this class to practice Method Overloading.

    // NOTE: We can have two methods with the same name as long as the method signatures are different.

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        double feetConversion = convertToCentimeters(feet * 12);
        double centConversion = convertToCentimeters(inches);
        System.out.print(feet + " ft " + inches + " in = " + (feetConversion + centConversion) + " centimeters.");
        return feetConversion + centConversion;
    }
}

// 1 inch = 2.54 cm
