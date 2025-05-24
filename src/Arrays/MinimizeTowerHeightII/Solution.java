package Arrays.MinimizeTowerHeightII;

import java.util.Arrays;

public class Solution {
    static int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int res = arr[n-1]-arr[0];

        for(int i=1; i<n; i++){
            if(arr[i]-k < 0){continue;}

            int minH = Math.min(arr[0]+k, arr[i]-k);
            int maxH = Math.max(arr[i-1]+k, arr[n-1]-k);

            res = Math.min(res, maxH-minH);
        }
        return res;
    }
    public static void main(String[] args) {
        int k = 6;
        int[] arr = {12, 6, 4, 15, 17, 10};

        int ans = getMinDiff(arr, k);
        System.out.println(ans);
    }
}
