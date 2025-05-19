package Arrays.NextPermutation;

import java.util.Arrays;

public class Solution {
    public static void nextPermutation(int[] arr) {
        int n = arr.length;

        // Step 1: Find the first index 'i' from the end where arr[i] < arr[i+1]
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // Step 2: If such an index was found, find index 'j' to swap with
        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            // Swap arr[i] and arr[j]
            swap(arr, i, j);
        }

        // Step 3: Reverse the subarray from i+1 to end
        reverse(arr, i + 1, n - 1);
    }

    // Utility method to swap two elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Utility method to reverse a subarray
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5, 4}; // example input
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
