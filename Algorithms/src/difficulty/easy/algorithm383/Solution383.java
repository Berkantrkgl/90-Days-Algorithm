package difficulty.easy.algorithm383;

import java.util.HashMap;

public class Solution383 {

    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
        System.out.println(anotherCanConstruct(ransomNote,magazine));
    }


    // This is my own solution
    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> mapMagazine = new HashMap<>();
        for (int i = 0 ; i < magazine.length() ; i++) {
            mapMagazine.put(magazine.charAt(i), mapMagazine.getOrDefault(magazine.charAt(i) , 0) + 1);
        }
        System.out.println(mapMagazine.values());


        for (int i = 0 ; i < ransomNote.length() ; i++) {
            if (mapMagazine.containsKey(ransomNote.charAt(i))) {
                mapMagazine.put(ransomNote.charAt(i), mapMagazine.get(ransomNote.charAt(i)) - 1);
                if (mapMagazine.containsValue(-1)) return false;
            } else {
                return false;
            }
        }
        return true;
    }

    // This is another solution with using Arrays
    public static boolean anotherCanConstruct(String ransomNote, String magazine) {
        int counter[] = new int[26];
        for (char c : magazine.toCharArray())
            counter[c - 'a']++;
        for (char c : ransomNote.toCharArray()) {

            if (counter[c - 'a'] == 0) return false;
            else counter[c - 'a']--;
        }
        return true;
    }

}
