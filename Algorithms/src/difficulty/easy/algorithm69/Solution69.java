package difficulty.easy.algorithm69;

public class Solution69 {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {

        if (x < 0) return 0;

        int start = 1;
        int end = x;
        int res = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            // Burada mid * mid yapmak yerine mid > x / mid yapmak gerek.
            // Cunku leetcode ile yapilan testlerde saklama alanai sorunu yasaniyor.
            if (mid > x / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
                res = mid;
            }
        }
        return res;
    }
}
