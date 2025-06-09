package StriverDSATutorial.RecursionAndBackTracking.Video3;

public class FactorialOfN {
    private static int getFactorial(int n){
        if (n==0) {
            return 1;
        }
        return n*getFactorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
}
