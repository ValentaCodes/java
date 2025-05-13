package Unidentified;

public class SpeedConverter {
    public static void main(String[] args) {
    printConversion(60);
    }

    public static long toMilesPerHour(double kilosPerHour) {
        if (kilosPerHour < 0) return -1;

        return Math.round(kilosPerHour/1.609);
    }

    public static void printConversion(double kilosPerHour) {
        if (kilosPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilosPerHour);
        System.out.println(kilosPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
