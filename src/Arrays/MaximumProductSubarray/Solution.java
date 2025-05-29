package Arrays.MaximumProductSubarray;

class Solution {
    // Function to find maximum product subarray
    static int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int leftToRight = 1;
        int rightToLeft = 1;
        int maxProd = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(leftToRight==0){leftToRight = 1;}
            if(rightToLeft==0){rightToLeft = 1;}

            leftToRight *= arr[i];

            rightToLeft *= arr[n-i-1];


            maxProd = Math.max(maxProd, Math.max(rightToLeft, leftToRight));
        }
        return maxProd;
    }
    public static void main(String[] args) {
        int arr[] = { -2, 6, -3, -10, 0, 2 };
        System.out.println(maxProduct(arr));
    }
}
