package difficulty.easy.algorithm125;

public class Solution125 {

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(isPalindrome(s));
    }

    // This is my own solution.
    public static boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        int length = s.length();
        int mid = length / 2, begin = 0, end = length - 1;

        if (length % 2 == 0) {
            while (begin < mid && end >= mid) {
                if (s.charAt(begin) != s.charAt(end)) return false;
                end--;
                begin++;
            }
        } else {
            while (begin < mid && end > mid) {
                if (s.charAt(begin) != s.charAt(end)) return false;
                begin++;
                end--;
            }
        }
        return true;
    }

    // This is another smart solution.
    public static boolean anotherIsPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
