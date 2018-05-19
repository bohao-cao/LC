package LeetCode.happyNumber;

import java.util.HashSet;
/*

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example:

Input: 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 */
public class Solution {
    public boolean isHappy(int n){
        HashSet<Integer> hs = new HashSet();

        while(n != 1){
            int i = n;
            int j;
            int t = 0;
            while(i != 0){
                j = i%10;
                t += j*j;
                i = i/10;
            }
            //Very important, avoid infinite loop
            if(hs.contains(t))
                return false;
            hs.add(t);
            n = t;
        }

        return true;
    }
}
