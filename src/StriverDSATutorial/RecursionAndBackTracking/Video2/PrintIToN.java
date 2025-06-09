package StriverDSATutorial.RecursionAndBackTracking.Video2;

public class PrintIToN {
    private static void printValue(int i, int n){
        if (i>n)return;
        System.out.println(i);
        printValue(i+1, n);
    }

    public static void main(String[] args) {
        printValue(1, 10);
    }
}
