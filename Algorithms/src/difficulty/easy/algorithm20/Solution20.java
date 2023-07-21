package difficulty.easy.algorithm20;

import java.util.Stack;

public class Solution20 {

    public static void main(String[] args) {

        String s = "()";
        System.out.println(isValid(s));
    }

    // Ths is my solution.
    public static boolean isValid(String s) {

        Stack<Character> stk= new Stack<>();

        if (s.length() % 2 != 0) return false;

        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') return false;

        char ch;

        for (int i = 0 ; i < s.length() ; i++) {
             ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else {
                if (stk.empty()) return false;
                if (ch == ')' && stk.peek() == '(') {
                    stk.pop();
                } else if (ch == ']' && stk.peek() == '['){
                    stk.pop();
                } else if (ch == '}' && stk.peek() == '{') {
                    stk.pop();
                } else {
                    return false;
                }
            }
        }
        return stk.empty();
    }
}
