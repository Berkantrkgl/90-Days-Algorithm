package difficulty.easy.algorithm66;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution66 {

    public static void main(String[] args) {
        int[] digits = {9,9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;

        while (i >= 0) {
            if (digits[i] == 9)
                digits[i--] = 0;
            else {
                digits[i]++;
                return digits;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
