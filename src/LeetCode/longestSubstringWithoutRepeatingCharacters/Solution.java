package LeetCode.longestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;


/*
Given a string, find the length of the longest substring without repeating characters.

        Examples:

        Given "abcabcbb", the answer is "abc", which the length is 3.

        Given "bbbbb", the answer is "b", with the length of 1.

        Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring,
        "pwke" is a subsequence and not a substring.
        https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
*/
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty())
            return 0;
        int ret=0;
        HashMap<Character, Integer> h = new HashMap();

        for(int i =0;i< s.length();i++){
            h.clear();
            int j=i;
            while(j<s.length()){
                if(h.containsKey(s.charAt(j))){
                    ret = Math.max(ret, h.keySet().size());
                    break;
                }
                else{
                    h.put(s.charAt(j), 1);
                    j++;
                }
            }
            ret = Math.max(ret, h.keySet().size());
        }

        return ret;
    }
}