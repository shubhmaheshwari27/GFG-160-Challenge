package StriverDSATutorial.RecursionAndBackTracking;

public class PrintNToI {
    private static void printNToI(int i, int n){
        if (i<n)return;

        System.out.println(i);
        printNToI(i-1, n);
    }

    public static void main(String[] args) {
        printNToI(5, 1);
    }

}
