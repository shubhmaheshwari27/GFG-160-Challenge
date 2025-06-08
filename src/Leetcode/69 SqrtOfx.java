package Leetcode;

class SqrtOfx {
    public static int mySqrt(int n){
        if (n<2)return n;
        int high=n, low=1, result=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            long midsquared = (long) mid*mid;
            if (midsquared==n) {
                return mid;
            } else if (midsquared<n) {
                result = mid;
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(25));
    }
}
