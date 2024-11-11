public class ForStatement {
    public static void main(String[] args) {
//        For loop practice 
        int counter = 0;
        for (int number = 10; number <= 50; number++) {

            if (isPrime(number)) {
                System.out.println(number + " is " + isPrime(number) + " a prime number.");
                counter++;
                if (counter == 3) {
                    break;
                }
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
