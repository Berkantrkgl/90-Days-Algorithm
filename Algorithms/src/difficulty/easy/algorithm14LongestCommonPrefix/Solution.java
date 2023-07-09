package difficulty.easy.algorithm14LongestCommonPrefix;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }


    public static String longestCommonPrefix(String[] strs) {

        int n = strs.length;

        if (n == 0) return "";
        if (n ==1) return strs[0];

        Arrays.sort(strs);

        int end = Math.min(strs[0].length(), strs[n - 1].length());

        int j = 0;
        while (j < end && strs[0].charAt(j) == strs[n - 1].charAt(j))
            j++;

        String result = strs[0].substring(0, j);

        return result;

    }
}
