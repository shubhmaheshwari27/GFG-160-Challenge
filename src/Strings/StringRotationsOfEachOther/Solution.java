package Strings.StringRotationsOfEachOther;

import java.util.Arrays;

class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.length()!=s2.length() || s1 == null || s2 == null){
            return false;
        }
        StringBuilder temp = new StringBuilder(s2);
        temp.append('$').append(s1).append(s1);
        int n=temp.length(),i=0, j=1,m=s2.length();
        int[] lps = new int[n];
        Arrays.fill(lps,0);
        String str= temp.toString();
        while(j<n){
            if(str.charAt(i)==str.charAt(j)){
                lps[j++]=++i;
                if(i==m){return true;}
            }else if(i!=0){
                i=lps[i-1];
            }else{j++;}
        }
        return false;

        // for(int i=0; i<s1.length(); i++){
        //     String rotated = s1.substring(i)+s2.substring(0,i);
        //     if(rotated.equals(s2)){return true;}
        // }
        // return false;

        // String combined = (s1+s1);
        // return combined.indexOf(s2)!= -1;
        // {^ takes more time}
        // return (s1+s1).contains(s2);
        // {^ takes more time}
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(areRotations(s1, s2));
    }
}
