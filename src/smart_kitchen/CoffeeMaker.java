package smart_kitchen;

/**
 * A representation of a smart coffee maker that will receive request from a smart kitchen class object.
 * @author Cornelius Davis
 * @version 0.0.1
 */
public class CoffeeMaker {
    private boolean hasWorkToDo;
    private int timeLeft;

    public CoffeeMaker(){}

    /**
     * Starts to brew coffee if work to do flag is true
     * @param hasWorkToDo - boolean
     */
    public void brewCoffee(boolean hasWorkToDo){
        if (hasWorkToDo) {
            System.out.println("Your coffee is being brewed.");
        }
    }
}
