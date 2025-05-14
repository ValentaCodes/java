package Unidentified;

public class ChallengeOperator {
    public static void main(String[] args) {
        double myDouble = 20.00d;
        double doubleDouble = 80.00d;
        double multiDouble = (myDouble + doubleDouble ) * 100.00d;
        double remainder = multiDouble % 40.00d;

        boolean isNoRemainder = remainder == 0;

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
