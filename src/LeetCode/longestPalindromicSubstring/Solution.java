package LeetCode.longestPalindromicSubstring;

/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
Example:
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
https://leetcode.com/problems/longest-palindromic-substring/description/
*/

class Solution {
    private int left;
    private int right;
    private int retLeft;
    private int retRight;
    public String longestPalindrome(String s) {
        if(s == null || s.isEmpty())
            return "";
        retLeft = 0;
        retRight = 0;

        for(int i =0;i < s.length(); i++){
            expand(s, i, i);
            if(this.right - this.left > retRight - retLeft){
                retLeft = this.left;
                retRight = this.right;
            }
            boolean has = expand(s, i, i+1);
            if(has && this.right - this.left > retRight - retLeft) {
                retLeft = this.left;
                retRight = this.right;
            }
        }

        return s.substring(retLeft, retRight+1);

    }

    private boolean expand(String s, int left, int right){
        boolean hasSomething=false;
        while(left >= 0 && right < s.length()){
            if(s.charAt(left) == s.charAt(right)){
                left --;
                right ++;
                hasSomething = true;
            }
            else{

                break;
            }

        }
        if(hasSomething)
        {
            left++;
            right--;
        }
        this.left = left;
        this.right = right;
        return hasSomething;

    }
}
