package smart_kitchen;

/**
 * A representation of a smart IOT refrigerator that will receive work requests from a smart kitchen.
 * @author Cornelius Davis
 * @version 0.0.1
 */
public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(){
    }

    /**
     * Start dishes if work is needed.
     * @param hasWorkToDo - boolean
     */
    public void doDishes(boolean hasWorkToDo){
        if (hasWorkToDo)
            System.out.println("Starting dishes");
    }
}
