package StriverDSATutorial.RecursionAndBackTracking;

public class PrintNToIUsingBackTracking {
    private static void PrintIToNValue(int i, int n){
        if (i>n)return;
        PrintIToNValue(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        PrintIToNValue(1,4);
    }
}
