package LeetCode.palindromicSubstrings;


/*
Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

Example 1:
Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:
Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
Note:
The input string length won't exceed 1000.

 */
//This can be optimized by combining singleCenter and doubleCenter together
public class Solution {
    public int countSubstrings(String s) {
        int res = 0;
        res+= singleCenter(s);
        if(s.length() > 1)
            res+= doubleCenter(s);
        return res;

    }

    private int singleCenter(String s){
        int count = 0;
        for(int i=0;i< s.length();i++){
            count++;
            int m = i-1, n = i+1;
            while(m>=0 && n< s.length()){
                if(s.charAt(m) == s.charAt(n)){
                    count++;
                    m--;
                    n++;
                }
                else
                 break;
            }
        }
        return count;
    }
    private int doubleCenter(String s){
        int count = 0;
        for(int i=0,j=1; j<s.length(); i++,j++){
            if(s.charAt(i)!=s.charAt(j))
                continue;
            count++;
            int m = i-1, n=j+1;
            while(m>=0 && n<s.length()){
                if(s.charAt(m)==s.charAt(n)){
                    count++;
                    m--;
                    n++;
                }
                else
                    break;

            }
        }
        return count;
    }


}
