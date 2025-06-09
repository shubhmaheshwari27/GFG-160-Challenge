package StriverDSATutorial.RecursionAndBackTracking.Video3;

public class SubmissionOfNFunctional {
    private static int print(int n) {
        if (n == 0) {
            return 0;
        }
        return n + print(n - 1);
    }
    public static void main(String[] args) {
        int value = print(3);
        System.out.println(value);
    }
}
