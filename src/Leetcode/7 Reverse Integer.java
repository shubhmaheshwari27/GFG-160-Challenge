package Leetcode;

class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0){
            int digit = num % 10;
            num /= 10;

            if(reversed > Integer.MAX_VALUE / 10 ||
                    (reversed == Integer.MAX_VALUE && digit > 7)){
                return 0;
            }

            if(reversed < Integer.MIN_VALUE / 10 ||
                    (reversed == Integer.MIN_VALUE && digit < -8)){
                return 0;
            }

            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
}
