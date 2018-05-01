package LeetCode.threeSumClosest;

/*
Given array nums = [-1, 2, 1, -4], and target = 1.
The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/
public class Solution {
    //this solution does not Sort, so it's very slow
    //the solution that uses 3 pointers is 10x faster.
    public int threeSumClosest(int[] nums, int target) {
        backtrack(nums, target, 0, 0, 0);
        return res;

    }
    private int res = 100000;
    private void backtrack(int[] nums, int target, int idx, int count, int sum){
        if(count == 3){
            res = Math.abs(sum - target) < Math.abs(res-target) ? sum : res;
            return;
        }
        for(int i=idx;i< nums.length;i++){
            sum+=nums[i];
            backtrack(nums,target, i+1, count+1, sum);
            sum-=nums[i];
        }

    }

}
