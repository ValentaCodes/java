package smart_kitchen;


/**
 * A Class that represents a smart kitchen with automated IOT appliances.
 *
 * @author Cornelius Davis
 * @version 0.0.1
 */
public class SmartKitchen {
    CoffeeMaker coffeeMaker = new CoffeeMaker();
    Dishwasher washer = new Dishwasher();
    Refrigerator fridge = new Refrigerator();

    public SmartKitchen() {
    }

    /**
     * Delegate and assign kitchen work for an appliance
     */
    public void doKitchenWork() {
        coffeeMaker.addWater();
        washer.loadDishwasher();
        fridge.pourMilk();
    }

    /**
     * Override of toString method
     */
    @Override
    public String toString() {
        return "SmartKitchen{" +
                "coffeeMaker=" + coffeeMaker +
                ", washer=" + washer +
                ", fridge=" + fridge +
                '}';
    }
}
