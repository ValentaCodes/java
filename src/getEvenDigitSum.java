public class getEvenDigitSum {
    public static void main(String[] args) {
       System.out.print(evenDigitSum(212));
    }

    public static int evenDigitSum(int n) {
        if (n < 0) return -1;

        int sum = 0;
        String strNum = Integer.toString(n);

        for (int i = 0; i < strNum.length(); i++) {
            if (((strNum.charAt(i) - '0') % 10) % 2 == 0) {
                sum += strNum.charAt(i) - '0';
            }
        }
       return sum;
    }
}
