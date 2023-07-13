package difficulty.easy.algorithm392;

public class Solution392 {

    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
        System.out.println(anotherIsSubsequence(s,t));
    }


    // This is my own solution.
    public static boolean isSubsequence(String s, String t) {

        if (s.equals(t)) {
            return true;
        }

        int index = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {

            for (int j = index; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    index = j + 1;
                    counter++;
                    break;
                }
            }
        }

        if (counter == s.length()) return true;

        return false;
    }

    public static boolean anotherIsSubsequence(String s, String t) {
        int i = 0;
        for (int j = 0 ; j < t.length() ; j++) {
            if (t.charAt(j) == s.charAt(i)) i++;
        }

        return i == s.length();
    }
}
