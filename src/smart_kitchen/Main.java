package smart_kitchen;

public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen1 = new SmartKitchen();
        kitchen1.setKitchenState(true, true, true);
        kitchen1.getFridge().orderFood();
        kitchen1.getWasher().doDishes();
        kitchen1.getCoffeeMaker().brewCoffee();
    }
}
