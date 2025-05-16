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
     * Setter method
     * @param hasWorkToDo - boolean
     */
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    /**
     * Loading the dishwasher will set hasWorkToDo to true.
     */
    public void loadDishwasher(){
        hasWorkToDo = true;
    }

    /**
     * Order food if it is needed.
     */
    public void doDishes(){
        if (hasWorkToDo) {
            System.out.println("Ordering you food you fat piece of shit.");
            hasWorkToDo = false;
        }
    }
}
