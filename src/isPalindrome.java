public class isPalindrome {
    public static void main(String[] args) {
        isItPalindrome(121);
    }

    public static boolean isItPalindrome(int number) {
        int cmpNumber = number;

        int reversedNumber = 0;
        int removal;

        do {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            removal = number /= 10;
        }
        while (removal != 0);

        return reversedNumber == cmpNumber;
    }
}
