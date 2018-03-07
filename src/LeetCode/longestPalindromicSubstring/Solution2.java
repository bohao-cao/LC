package LeetCode.longestPalindromicSubstring;

/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
Example:
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
https://leetcode.com/problems/longest-palindromic-substring/description/
*/

class Solution2 {
    class Ret implements Comparable<Ret>{
        public int Left;
        public int Right;
        public Ret(int l, int r){
            Left = l;
            Right = r;
        }
        public int compareTo(Ret b){
            if(this.Right - this.Left > b.Right - b.Left) return 1;
            if(this.Right - this.Left < b.Right - b.Left) return -1;
            else
                return 0;
        }


    }
    public String longestPalindrome(String s) {
        Ret ret = new Ret(0,0);
        if(s == null || s.isEmpty())
            return null;

        for(int i=0;i< s.length();i++){
            Ret r1 = find(s, i, i);
            Ret r2 = find(s, i, i+1);
            Ret m = r1.compareTo(r2) == 1 ? r1 : r2;
            ret = ret.compareTo(m) == 1? ret : m;
        }

        return s.substring(ret.Left, ret.Right+1);
    }

    private Ret find(String s, int left, int right){
        int l = left;
        int r = right;
        boolean found = false;

        while(l>=0 && r < s.length() && s.charAt(l)== s.charAt(r)){
            l--;
            r++;
            found = true;
        }
        if(found){
            l++;
            r--;
            return new Ret(l,r);
        }
        return new Ret(1,0);

    }
}