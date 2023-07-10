package difficulty.easy.algorithm28;

public class Solution {

    public static void main(String[] args) {
        String haystack = "abc", needle = "c";
        System.out.println(strStr(haystack,needle));
    }

    // This is my own solution.
    public static int strStr(String haystack, String needle) {

        if (haystack.equals(needle)) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0 ; i < (haystack.length() - needle.length()) ; i++) {
            int j = 0;
            int counter = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                counter++;
                j++;
            }
            if (counter == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
