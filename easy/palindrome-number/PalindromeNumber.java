public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome2(x));
    }

    public static boolean isPalindrome(int x) {
        String xString = String.valueOf(x);
        for (int i = 0; i < xString.length(); i++) {
            if (xString.charAt(i) != xString.charAt(xString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(int x) {
        // Special cases: negaive, last digit is zero
        if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
        }

        int lastHalf = 0;
        while (x > lastHalf) {
            lastHalf = lastHalf * 10 + x % 10;
            x /= 10;
        }

        return x == lastHalf || x == lastHalf / 10;
    }
}
