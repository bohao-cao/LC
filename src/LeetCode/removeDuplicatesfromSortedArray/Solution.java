package LeetCode.removeDuplicatesfromSortedArray;
/*
Example 1:

        Given nums = [1,1,2],

        Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

        It doesn't matter what you leave beyond the returned length.
        Example 2:

        Given nums = [0,0,1,1,1,2,2,3,3,4],

        Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

        It doesn't matter what values are set beyond the returned length.
*/
public class Solution {
    public int removeDuplicates(int[] nums) {
        int res = 0,j=0;
        for(int i=0;i< nums.length && j< nums.length;i++){

            while(j< nums.length && nums[j]==nums[i])
                j++;
            if(j < nums.length && j>i){
                nums[i+1]=nums[j];
                res++;

            }
        }

        return res;

    }
}
