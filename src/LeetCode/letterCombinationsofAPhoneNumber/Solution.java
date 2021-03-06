package LeetCode.letterCombinationsofAPhoneNumber;

import java.util.*;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.



Example:

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
Note:

Although the above answer is in lexicographical order, your answer could be in any order you want.


 */
public class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.isEmpty())
            return new ArrayList() {};
        HashMap<Integer, char[]> map = new HashMap<>();
        map.put(1, new char[0]);
        map.put(2, new char[]{'a','b','c'});
        map.put(3, new char[]{'d','e','f'});
        map.put(4, new char[]{'g','h','i'});
        map.put(5, new char[]{'j','k','l'});
        map.put(6, new char[]{'m','n','o'});
        map.put(7, new char[]{'p','q','r','s'});
        map.put(8, new char[]{'t','u','v'});
        map.put(9, new char[]{'w','x','y','z'});
        map.put(0, new char[0]);


        Queue<String> q = new LinkedList<>();
        q.add("");
        for(char c: digits.toCharArray()){
            int num = Character.getNumericValue(c);

            int size = q.size();
            while(size-->0){
                String s = q.poll();
                for(char cc: map.get(num)){
                    StringBuilder b = new StringBuilder(s);
                    q.add(b.append(cc).toString());
                }
            }
        }

        return new ArrayList<String>(q);
    }
}
