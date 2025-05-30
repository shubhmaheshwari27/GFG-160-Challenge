package Strings.ImplementATOI;

class Solution {
    public static int myAtoi(String s) {
        // Your code here
        int n = s.length();
        int sign = 1;
        int i = 0;
        int result = 0;
        while(i<n && s.charAt(i)==' '){
            i++;
        }

        if(i<n){
            if(s.charAt(i)=='-'){
                sign = -1;
                i++;
            }else if(s.charAt(i)=='+'){
                i++;
            }
        }

        int INT_MAX=2147483647;
        int INT_MIN=-2147483648;

        while(i<n){
            char ch = s.charAt(i);

            if(ch<'0'|| ch>'9'){
                break;
            }
            int digit = ch-'0';

            if(result> (INT_MAX - digit)/10){
                return(sign == 1)? INT_MAX:INT_MIN;
            }
            result = result * 10 + digit;
            i++;
        }
        return result*sign;
    }

    public static void main(String[] args) {
        String s = "  -123sb";
        System.out.println(myAtoi(s));
    }
}
