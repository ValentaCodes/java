
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

//Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
//
//This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
//
//Then it needs to print a message in the format "XX km/h = YY mi/h".
//
//XX represents the original value kilometersPerHour.
//YY represents the rounded milesPerHour from the kilometersPerHour parameter.
//
//If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

