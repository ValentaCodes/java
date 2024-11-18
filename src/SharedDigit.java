public class SharedDigit {
    // Write a method named hasSharedDigit with two parameters of type int.
// Each number should be within the range of 10 (inclusive) - 99 (inclusive).
// If one of the numbers is not within the range, the method should return false.
// The method should return true if there is a digit that appears in both numbers,
// such as 2 in 12 and 23; otherwise, the method should return false.
    public static void main(String[] args) {
        hasSharedDigit(21, 21);
    }

    public static boolean hasSharedDigit(int n, int n2) {
        if (n < 10 || n > 99 || n2 < 10 || n2 > 99) {
            return false;
        }

        String s = Integer.toString(n);
        String s2 = Integer.toString(n2);

        for (int i = 0; i < s.length(); i++) {
            if (s2.contains(String.valueOf(s.charAt(i)))) {
        return true;
            }
        }
        return false;
    }
}

