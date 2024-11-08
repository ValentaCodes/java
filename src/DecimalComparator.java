public class DecimalComparator {

    public static void main(String[] args) {
    areEqualByThreeDecimalPlaces(-3.1756, 3.1757);
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        long roundedA = (long) (a * 1000L);
        long roundedB = (long) (b * 1000L);
        if (Math.round(roundedA) == Math.round(roundedB)) return true;
        return roundedA - roundedB == 0;
    }
}
