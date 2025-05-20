package Arrays.MajorityElement;

import java.util.ArrayList;
import java.util.List;

class Solution {
    // Function to find the majority elements in the array
    public static List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n = nums.length;
        int ele1 = -1, ele2 = -1;
        int cnt1 = 0, cnt2 = 0;

        for(int ele : nums){
            if(ele1 == ele){
                cnt1++;
            }
            else if(ele2 == ele){
                cnt2++;
            }
            else if(cnt1 == 0){
                ele1 = ele;
                cnt1++;
            }
            else if(cnt2 == 0){
                ele2 = ele;
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> res = new  ArrayList<>();
        int count1 = 0;
        int count2 = 0;

        for(int ele : nums){
            if (ele1 == ele){count1++;}
            if (ele2 == ele){count2++;}
        }
        if (count1 > n/3){res.add(ele1);}
        if (count2 > n/3 && ele1!=ele2){res.add(ele2);}

        if (res.size() == 2 && res.get(0) > res.get(1)){
            int temp = res.get(0);
            res.set(0, res.get(1));
            res.set(1, temp);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-1,-1,-1};
        List<Integer> res = findMajority(arr);
        for (int ele : res) {
            System.out.print(ele+ " ");
        }
    }
}
