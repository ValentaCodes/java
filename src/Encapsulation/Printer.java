package Encapsulation;

/**
 * A representation of a laser printer
 *
 * @author Cornelius Davis
 */
public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex){
        this(100, 0, false);
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
            this.tonerLevel = tonerLevel;
            this.pagesPrinted = pagesPrinted;
            this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        tonerLevel = tonerLevel + tonerAmount;
        if (tonerLevel >= 100) {
        System.out.println("Toner is at full capacity");
            return tonerLevel = 100;
        } else if (tonerLevel <=0) {
            System.out.println("toner is empty... Please refill before using.");
           return tonerLevel = -1;
        } else {
            System.out.println("Adding toner..." + " New toner level: " + tonerLevel);

            return tonerLevel;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void printPages(int pages){
        if (duplex) {
            System.out.println("This is a duplex printer");
            pagesPrinted = pagesPrinted + (int)(pages*.5);
        }
        pagesPrinted = pagesPrinted + pages;
//        tonerLevel = tonerLevel - (int)(pages * .5);
        System.out.println("Printing " + pages + " pages..." + "Total pages printed: " + pagesPrinted);
    }
}
