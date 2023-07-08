package difficulty.easy.algorithm13RomanToInteger;

public class Solution {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    // This is my own solution =>
    public static int romanToInt(String s) {
        int result = 0;
        char[] chrArr = new char[s.length()];

        for (int i = 0 ; i < s.length() ; i++) {
            chrArr[i] = s.charAt(i);
        }

        for (int i = 0 ; i < chrArr.length ; i++) {

            switch (chrArr[i]) {
                case 'I':
                    if (i == (chrArr.length - 1)) result += 1;
                    else if (chrArr[i + 1] == 'V') {
                        i++;
                        result += 4;
                    }
                    else if (chrArr[i + 1] == 'X'){
                        i++;
                        result += 9;
                    }
                    else result += 1;
                    break;
                case 'X':
                    if (i == (chrArr.length - 1)) result += 10;
                    else if (chrArr[i + 1] == 'L'){
                        i++; result += 40;
                    }
                    else if (chrArr[i + 1] == 'C'){
                        i++; result += 90;
                    }
                    else result += 10;
                    break;

                case 'C':
                    if (i == (chrArr.length - 1)) result += 100;
                    else if (chrArr[i + 1] == 'D'){
                        i++; result += 400;
                    }
                    else if (chrArr[i + 1] == 'M'){
                        i++; result += 900;
                    }
                    else result += 100;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'L':
                    result +=50;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;

            }
        }

        return result;
    }
}
