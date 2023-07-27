package difficulty.easy.algorithm9;

public class Solution9 {

    public static void main(String[] args) {
        int num = 987654321;
        System.out.println(isPalindrome(num));
        System.out.println(anotherIsPalindrome(num));
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) return false;
        int sum = 0;
        int first_num = num;
        while (num > 0) {
            int current = num % 10;
            sum = (sum * 10) + current;
            num = num / 10;
        }
        return sum == first_num;
    }

    public static boolean anotherIsPalindrome(int num) {
        int newNum;
        if (num < 0) return false;
        char ch;
        String nstr = "";
        String str = Integer.toString(num);
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        newNum = Integer.valueOf(nstr);
        return num == newNum;
    }
}
