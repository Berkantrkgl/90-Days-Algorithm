package difficulty.easy.algorithm290;

import java.util.HashMap;
import java.util.Map;

public class Solution290 {

    public static void main(String[] args) {
        String pattern = "aaa", s = "aa aa aa aa";
        System.out.println(wordPattern(pattern,s));
        System.out.println(anotherWordPattern(pattern,s));
    }

    public static boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map = new HashMap<Character, String>();

        String[] splited = s.split("\\s+");

        if (pattern.length() != splited.length) {
            return false;
        }

        // pattern = "abba", s = "dog cat cat dog"
        for (int i = 0 ; i < pattern.length() ; i++) {
            if (map.containsKey(pattern.charAt(i))){
                if (map.get(pattern.charAt(i)).equals(splited[i])) continue;
                else return false;
            } else {
                if (!map.containsValue(splited[i])) {
                    map.put(pattern.charAt(i), splited[i]);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    // this is a really impressive specimen
    public static boolean anotherWordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        Map index = new HashMap();

        // I just learned about the conditional loop here.
        // Because what we're doing here is actually using the return property of HashMap's put function.
        for (Integer i=0; i<words.length; ++i)
            // If a new HashMap pair is added it returns "NULL",
            // if an existing pair is updated it returns the "value" of the old pair.
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;

        return true;
    }
}
