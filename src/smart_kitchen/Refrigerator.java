package smart_kitchen;

/**
 * A representation of a smart IOT refrigerator that will receive work requests from a smart kitchen.
 * @author Cornelius Davis
 * @version 0.0.1
 */
public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(){}

    /**
     * Setter method
     * @param hasWorkToDo - boolean
     */
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    /**
     * Pouring milk will set hasWorkToDo to true.
     */
    public void pourMilk(){
        hasWorkToDo = true;
    }

    /**
     * Start dishes if work is needed.
     */
    public void orderFood(){
        if (hasWorkToDo) {
            System.out.println("Starting dishes");
            hasWorkToDo = false;
        }
    }

}
