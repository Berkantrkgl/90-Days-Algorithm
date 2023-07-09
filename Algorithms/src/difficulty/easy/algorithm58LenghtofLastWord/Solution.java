package difficulty.easy.algorithm58LenghtofLastWord;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        String s = "a ";
        System.out.println(lengthOfLastWord(s));



    }

    public static int lengthOfLastWord(String s) {
        int sum = 0;
        if (s.length() == 0) {
            return 0;
        }

        if (s.length() == 1 && s.charAt(0) != ' '){
            return 1;
        }
        for (int i = s.length() - 1 ; i >= 0 ; i--) {

           if (s.charAt(i) == ' ') {
               continue;
           } else {
               sum++;
               if (i == 0) break;
               if (s.charAt(i - 1) == ' '){
                   break;
               }
           }
        }
        return sum;
    }
}
