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


    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : 1;
        this.duplex = duplex;
    }

    /**
     * Adds toner to the printer.
     *
     * @param tonerAmount int
     * @return int - current toner level
     */
    public int addToner(int tonerAmount) {
        int tempAmount = tonerLevel + tonerAmount;
        if (tempAmount > 100 || tempAmount < 0) {
            return tonerLevel = -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
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

    public int printPages(int pages) {
       int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
       pagesPrinted += jobPages;
       return jobPages;
    }
}
