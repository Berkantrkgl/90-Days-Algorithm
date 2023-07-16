package difficulty.easy.algorithm242;

import java.util.HashMap;

public class Solution242 {

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    // Input: s = "anagram", t = "nagaram"
    // This is my own solution with HashMap.
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0 ; i < t.length() ; i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        System.out.println(map);

        for (int i = 0 ; i < s.length() ; i++) {
            if (map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
            else return false;
        }

        for (Integer num : map.values()){
            if (num != 0) return false;
        }

        return true;
    }

    //It has similarities with my solution. My solution provides control by querying 0 in the map.values() array.
    // Here, instead of doing it, deleting the Map pair is followed.
    public static boolean anotherIsAnagram(String s, String t ) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
}
