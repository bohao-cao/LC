package LeetCode.perfectSquares;

import java.util.Arrays;

/*
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

Example 1:

Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4.
Example 2:

Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.
 */
public class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, 0);

        for(int i=1;i <=n;i++){
            if((int)Math.sqrt(i)* (int)Math.sqrt(i) == i){
                dp[i]=1;
                continue;
            }


            int x = 1;
            int y = i-1;
            int min = Integer.MAX_VALUE;
            while(x <= y){
                min = Math.min(dp[x]+dp[y], min);
                x++;
                y--;
            }
            dp[i]=min;
        }

        return dp[n];

    }
}
