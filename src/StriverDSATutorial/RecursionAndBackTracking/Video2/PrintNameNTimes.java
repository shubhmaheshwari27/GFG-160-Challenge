package StriverDSATutorial.RecursionAndBackTracking.Video2;

public class PrintNameNTimes {
    public static void main(String[] args) {
        printName(1,5);
    }

    private static void printName(int i, int n){
        if (i>n){return;}

        System.out.println("Striver");
        printName(i+1, n);
    }
}
