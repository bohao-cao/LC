package LeetCode.minCostClimbingStairs;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 0)
            return 0;
        if(cost.length == 1)
            return cost[0];
        int c0=cost[0];
        if(cost.length ==2)
            return Math.min(c0, cost[1]);
        int c1=Math.min(c0, cost[1]);
        int c2=0;
        for(int i=2;i< cost.length;i++){
            c2 = cost[i] + Math.min(c0, c1);
            c0 = c1;
            c1 = c2;
        }

        return Math.min(c1,c2);
    }
}
