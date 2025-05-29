package Arrays.MaxCircularSubarraySum;

class Solution {
    public static int circularSubarraySum(int arr[]) {
        // Code here
        int n = arr.length;
        int minI=Integer.MAX_VALUE, maxI=Integer.MIN_VALUE, total=0, sum1=0, sum2=0;

        for(int i=0; i<n; i++){
            total += arr[i];
            sum2=Math.min(arr[i], sum2+arr[i]);
            minI=Math.min(minI,sum2);

            sum1=Math.max(arr[i], sum1+arr[i]);
            maxI=Math.max(maxI, sum1);
        }
        return Math.max(maxI, total-minI);
    }
    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(circularSubarraySum(arr));
    }
}
