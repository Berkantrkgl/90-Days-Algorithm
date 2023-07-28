package difficulty.easy.algorithm69;

public class Solution69 {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {

        if (x < 0) return 0;

        int start = 0;
        int end = x;
        int res = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid < x) {
                start = mid + 1;
                res = mid;
            } else if (mid * mid > x) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return res;
    }
}
