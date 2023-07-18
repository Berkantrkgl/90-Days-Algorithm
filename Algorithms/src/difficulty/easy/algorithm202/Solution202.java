package difficulty.easy.algorithm202;

import java.util.HashMap;
import java.util.HashSet;

public class Solution202 {

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    // This is my own solution.
    public static boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();
        set.add(n);

        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                sum += (n%10)*(n%10);
                n /= 10;
            }
            if (set.contains(sum))
                return false;

            set.add(sum);
            n = sum;
        }
        return true;
    }
}
