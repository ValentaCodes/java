package smart_kitchen;

/**
 * A representation of a smart IOT dishwasher that will receive work requests from a smart kitchen.
 * @author Cornelius Davis
 * @version 0.0.1
 */
public class Dishwasher {
    private boolean hasWorkToDo;

    public Dishwasher(){}

    /**
     * Order food if it is needed.
     * @param hasWorkToDo - boolean
     */
    public void orderFood(boolean hasWorkToDo){
        if (hasWorkToDo)
            System.out.println("Ordering you food you fat piece of shit.");
    }
}
