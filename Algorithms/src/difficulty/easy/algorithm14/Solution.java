package difficulty.easy.algorithm14;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(anotherLongestCommonPrefix(strs));
    }

    // First approach
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

    // Another good approach for coding 
    public static String anotherLongestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length - 1];
        int subSize = 0;

        while (subSize < firstString.length() && subSize < lastString.length()) {
            if (firstString.charAt(subSize) == lastString.charAt(subSize)) {
                subSize++;
            } else {
                break;
            }
        }
        String result = firstString.substring(0, subSize);

        return result;
    }














}
