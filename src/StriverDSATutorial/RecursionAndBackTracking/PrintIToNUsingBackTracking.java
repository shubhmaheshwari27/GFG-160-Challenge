package StriverDSATutorial.RecursionAndBackTracking;

public class PrintIToNUsingBackTracking {
    private static void printIToN(int i, int n){
        if (i<1)return;
        printIToN(i-1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        printIToN(4,1);
    }
}
