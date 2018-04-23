package LeetCode.removeElement;

import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/remove-element/description/
/*
Given nums = [0,1,2,2,3,0,4,2], val = 2,
Your function should return length = 5,
with the first five elements of nums containing 0, 1, 3, 0, and 4.
*/
public class Solution {
    //This is simple solution is found from the highest voted discussion board.
    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=val){
                nums[idx]=nums[i];
                idx++;
            }

        }
        return idx;

    }
}
