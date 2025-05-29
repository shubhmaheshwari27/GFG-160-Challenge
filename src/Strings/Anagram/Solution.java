package Strings.Anagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean areAnagrams(String s1, String s2){
        if (s1.length() != s2.length()){return false;}

        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch: s1.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
        }

        for (char ch: s2.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch, 0)-1);
        }

        for (var pair: charCount.entrySet()){
            if (pair.getValue() != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "g";
        String s2 = "g";
        System.out.println(areAnagrams(s1, s2)? "true" : "false");
    }
}
