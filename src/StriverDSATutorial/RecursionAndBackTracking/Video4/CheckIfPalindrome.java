package StriverDSATutorial.RecursionAndBackTracking.Video4;

public class CheckIfPalindrome {
    public static void main(String[] args) {
        String str = "MADam";
        System.out.println(isPalindrome(0, str));
    }

    public static boolean isPalindrome(int i, String str){

        if (i>=str.length()/2){
            return true;
        }

        if (str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
        }
        return isPalindrome(i+1, str);
    }
}
