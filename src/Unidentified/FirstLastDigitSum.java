package Unidentified;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(firstLastDigitSum(0));
    }

    public static int firstLastDigitSum(int n) {
        if (n < 0) return -1;

        int lastDigit = n % 10;

        String stringNum = Integer.toString(n);
        int firstDigit = stringNum.charAt(0) - '0';

        return firstDigit + lastDigit;

    }
}
