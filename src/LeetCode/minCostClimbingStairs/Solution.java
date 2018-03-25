package LeetCode.minCostClimbingStairs;

import java.util.Arrays;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 0)
            return 0;
        if(cost.length == 1)
            return cost[0];
        int c0=cost[0];
        int c1=cost[1];
        int c2=0;
        for(int i=2;i< cost.length-1;i++){
            c2 = cost[i] + Math.min(c0, c1);
            c0 = c1;
            c1 = c2;
        }


        int[] x= new int[10];
        Arrays.copyOfRange(x,0,1);
        return  Math.min(c0+cost[cost.length-1], c1);
    }
}
