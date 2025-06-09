package StriverDSATutorial.RecursionAndBackTracking.Video3;

public class SubmissionOfNParameterized {
    private static void print(int i, int sum){
        if (i<0){
            System.out.println(sum);
            return;
        }
        print(i-1, sum+1);
    }

    public static void main(String[] args) {
        print(5,0);
    }
}
