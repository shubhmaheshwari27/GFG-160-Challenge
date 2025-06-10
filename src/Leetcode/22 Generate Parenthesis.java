package Leetcode;

import java.util.ArrayList;
import java.util.List;

class GeneralParenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve("",0,0,n,ans);
        return ans;
    }

    private static void solve(String curr,int open,int closed,int total,List<String> ans){
        if(curr.length()==total*2){
            ans.add(curr);
            return;
        }
        if(open<total){
            solve(curr+"(",open+1, closed, total, ans);
        }
        if(closed<open){
            solve(curr+")",open, closed+1, total, ans);
        }
    }
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

}
