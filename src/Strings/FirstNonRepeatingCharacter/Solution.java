package Strings.FirstNonRepeatingCharacter;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static char nonRepeatingChar(String s){
        Map<Character, Integer> countMap =new  LinkedHashMap<>();
        for (char ch: s.toCharArray()){
            countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
        }
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()){
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        System.out.println(nonRepeatingChar("aba"));
    }
}
