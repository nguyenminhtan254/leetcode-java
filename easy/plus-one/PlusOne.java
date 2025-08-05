import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] digits1 = {9, 9, 9};
        int[] digits2 = {1, 2, 9, 9};
        System.out.println(Arrays.toString(plusOne1(digits)));
        System.out.println(Arrays.toString(plusOne1(digits1)));
        System.out.println(Arrays.toString(plusOne1(digits2)));
    }

    public static int[] plusOne(int[] digits) {
        int[] newDigits = Arrays.copyOf(digits, digits.length);

        for (int i = newDigits.length - 1; i >= 0; i--) {
            if (newDigits[i] == 9) {
                if (i == 0) {
                    newDigits[i] = 1;
                    newDigits = Arrays.copyOf(newDigits, digits.length + 1);
                    newDigits[newDigits.length - 1] = 0;
                    break;
                }
                newDigits[i] = 0;
            } else {
                newDigits[i]++;
                break;
            }
        }

        return newDigits;
    }

    public static int[] plusOne1(int[] digits) {
        int length = digits.length;

        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[length + 1];
        newDigits[0] = 1;

        return newDigits;
    }
}
