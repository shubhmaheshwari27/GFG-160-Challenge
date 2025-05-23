package Arrays.MaximumProfitMaxOneTransaction;

public class Solution {
    public static int maximumProfit(int[] prices) {
        // Code here
//        int minSoFar = prices[0];
//        int res = 0;
//
//        for(int i=1; i<=prices.length-1; i++){
//            minSoFar = Math.min(minSoFar, prices[i]);
//            res = Math.max(res, prices[i]-minSoFar);
//    }return res;
        int res = 0;
        int n = prices.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                res = Math.max(res,prices[j]-prices[i]);
            }
        }return res;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maximumProfit(prices));
    }
}
