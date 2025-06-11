package StriverDSATutorial.RecursionAndBackTracking.Video4;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        reverseArray(nums,0);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverseArray(int[] nums, int i){
        if (i>=nums.length/2){
            return;
        }
        swap(i, nums.length-i-1, nums);
        reverseArray(nums, i+1);
    }
    private static void swap(int i, int j, int[] nums){
        int temp=nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
}
