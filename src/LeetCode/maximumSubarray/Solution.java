package LeetCode.maximumSubarray;

/*Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

        For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
        the contiguous subarray [4,-1,2,1] has the largest sum = 6.*/
public class Solution {
    public int maxSubArray(int[] nums) {
        int imax=nums[0];
        int absoluteMax = imax;
        int[] maxHist = new int[nums.length];
        maxHist[0] = imax;

        for(int i=1;i<nums.length;i++){
            imax = Math.max(imax+nums[i], nums[i]);
            absoluteMax = Math.max(absoluteMax, imax);
            maxHist[i]=absoluteMax;
        }

        return absoluteMax;
    }
}
