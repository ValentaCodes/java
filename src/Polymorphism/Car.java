package Polymorphism;

public class Car {
    private String description;

    public Car() {
        this("just a car");
    }
    public Car(String description) {
        this.description = description;
    }

    public static Car getInstance(String description) {
        return switch (description.toLowerCase().charAt(0)) {
            case 'e' -> new ElectricCar("Electric car", 200, 6);
            case 'g' -> new GasPoweredCar("Gas Vehicle", 400, 12);
            case 'h' -> new HybridCar("Hybrid", 600, 12, 4);
            default -> new Car("A car");
        };
    }

    public static void runEngine() {
        System.out.println("Cannot run engine. No engine has been installed.");
    }

    public void startEngine() {
        System.out.println("Cannot start engine. No engine is has been installed.");
    }

    public void drive() {
        System.out.println("This is a factory vehicle it can't drive.");
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar() {
        super("Gas Vehicle");
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("avg km/litre: " + avgKmPerLitre + "." + " cylinders: "  + cylinders);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Vroom!");
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super("This is electric");
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Phhewwww");
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Welcome to your electric vehicle.");
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super("Hybrid Vehicle");
    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }


    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println();
    }

    @Override
    public void drive() {
        super.drive();
    }
}
