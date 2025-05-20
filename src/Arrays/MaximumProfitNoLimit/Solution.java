package Arrays.MaximumProfitNoLimit;

public class Solution {
    public static int maximumProfit(int[] prices) {
        // code here
        int n = prices.length;
        int lmin = prices[0];
        int lmax = prices[0];
        int res = 0;
        int i = 0;

//        while(i<n-1){
//            while(i <n-1 && prices[i] >= prices[i+1]){
//                i++;
//                lmin = prices[i];
//            }
//            lmax = lmin;
//            while(i<n-1 && prices[i] <= prices[i+1]){
//                i++;
//                lmax = prices[i];
//            }
//            res += (lmax - lmin);
//
//        }
        //greedy method
        for (i=0; i<n-1;i++){
            if (prices[i+1]>prices[i]){
                res += (prices[i+1]-prices[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {57,94,87,60,89,82,35,90,86,24,77,38,24,23,72,59};
        System.out.print(maximumProfit(prices));
    }
}
