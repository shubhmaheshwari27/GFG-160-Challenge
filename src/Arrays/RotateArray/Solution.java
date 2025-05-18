package Arrays.RotateArray;

import java.util.Arrays;

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static int[] rotateArr(int[] arr, int d) {
        // add your code here
        int n = arr.length;
        if (n == 0 || d % n == 0) return arr;
        if (d>= n){d = d%n;}
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
        return arr;
    }

    static void reverse(int[] arr, int start, int end){
        int temp;

        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 10};
        int[] myArr = rotateArr(arr, 5);
        System.out.println(Arrays.toString(myArr));
    }
}
