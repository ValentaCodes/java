package smart_kitchen;

/**
 * A representation of a smart coffee maker that will receive request from a smart kitchen class object.
 * @author Cornelius Davis
 * @version 0.0.1
 */
public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(){}

    /**
     * Setter method
     * @param hasWorkToDo - boolean
     */
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    /**
     * Adding water will set hasWorkToDo to true
     */
    public void addWater(){
        hasWorkToDo = true;
    }

    /**
     * Starts to brew coffee if work to do flag is true
     */
    public void brewCoffee(){
        if (hasWorkToDo) {
            System.out.println("Your coffee is being brewed.");
            hasWorkToDo = false;
        }
    }
}
