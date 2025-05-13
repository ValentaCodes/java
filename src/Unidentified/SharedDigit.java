package Unidentified;

public class SharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(21, 32);
    }

    public static boolean hasSharedDigit(int n, int n2) {
        if (n >= 10 && n <= 99 && n2 >= 10 && n2 <= 99) {
            String s = Integer.toString(n);
            String s2 = Integer.toString(n2);
            for (int i = 0; i < s.length(); i++) {
                if (s2.contains(String.valueOf(s.charAt(i)))) {
                    return true;
                }
            }
        }
        return false;
    }
}

