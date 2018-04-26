package LeetCode.perfectSquares;

import java.util.Arrays;

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
