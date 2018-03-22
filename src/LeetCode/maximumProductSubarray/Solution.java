package LeetCode.maximumProductSubarray;

/*
Find the contiguous subarray within an array (containing at least one number) which has the largest product.
For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.
*/


import java.util.Arrays;

public class Solution {
    public int maxProduct(int[] nums) {
        int imin=1, imax=1;
        int absoluteMax = Integer.MIN_VALUE;
        int[]maxHistory = new int[nums.length];
        Arrays.fill(maxHistory,Integer.MIN_VALUE);
        for(int i=0;i<nums.length;i++){
            //Once swapped and multiplied by the negative number, the imax becomes the local real max and so is min;
            if(nums[i] < 0){
                int t = imin;
                imin = imax;
                imax =t;
            }
            //imax is the local max
            imax = Math.max(imax*nums[i], nums[i]);
            imin = Math.min(imin*nums[i], nums[i]);
            absoluteMax = Math.max(imax,absoluteMax);
            maxHistory[i]= absoluteMax;
        }
        return absoluteMax;
    }
}
