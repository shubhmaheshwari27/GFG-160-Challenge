package Leetcode;

import java.util.ArrayList;
import java.util.List;

class CombinationSum {

    public void getAllCombinations(int[] arr, int idx, int tar, List<List<Integer>> ans, List<Integer> combin) {
        if (tar == 0) {
            ans.add(new ArrayList<>(combin)); // Found a valid combination
            return;
        }

        if (idx == arr.length || tar < 0) {
            return; // Out of bounds or exceeded target
        }

        // Include current element
        combin.add(arr[idx]);
        getAllCombinations(arr, idx, tar - arr[idx], ans, combin);
        combin.remove(combin.size() - 1); // Backtrack

        // Exclude current element and move to next
        getAllCombinations(arr, idx + 1, tar, ans, combin);
    }

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combin = new ArrayList<>();
        getAllCombinations(arr, 0, target, ans, combin);
        return ans;
    }

    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = cs.combinationSum(arr, target);
        System.out.println(result);
    }
}
