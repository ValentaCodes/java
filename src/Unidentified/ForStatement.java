package Unidentified;

public class ForStatement {
    public static void main(String[] args) {
//        For loop practice
        int counter = 0;
        for (int i = 10; counter < 3 && i <= 50; i++) {

            if (isPrime(i)) {
                System.out.println(i + " is " + isPrime(i) + " a prime number.");
                counter++;
            }

        }

        System.out.println("There are a total " + counter + " prime numbers");
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return wholeNumber == 2;
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
