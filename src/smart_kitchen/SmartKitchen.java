package smart_kitchen;


/**
 * A Class that represents a smart kitchen with automated IOT appliances.
 *
 * @author Cornelius Davis
 * @version 0.0.1
 */
public class SmartKitchen {
    private final CoffeeMaker coffeeMaker;
    private final Dishwasher washer;
    private final Refrigerator fridge;

    public SmartKitchen() {
        coffeeMaker = new CoffeeMaker();
        washer = new Dishwasher();
        fridge = new Refrigerator();
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public Dishwasher getWasher() {
        return washer;
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    /**
     * Set the flags to either true or false to assign to flags.
     * @param coffeeFlag boolean
     * @param washerFlag boolean
     * @param fridgeFlag boolean
     */
    public void setKitchenState(boolean coffeeFlag, boolean washerFlag, boolean fridgeFlag){
        coffeeMaker.setHasWorkToDo(coffeeFlag);
        washer.setHasWorkToDo(washerFlag);
        fridge.setHasWorkToDo(fridgeFlag);
    }

    /**
     * Delegate and assign kitchen work for an appliance
     */
    public void doKitchenWork() {
        coffeeMaker.brewCoffee();
        washer.doDishes();
        fridge.orderFood();
    }
}
