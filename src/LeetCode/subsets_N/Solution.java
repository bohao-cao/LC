package LeetCode.subsets_N;

import java.util.*;

/**************
 * Index of several subset problems
 * https://goo.gl/62K3Qe
 */


/* https://leetcode.com/problems/subsets/description/
Given a set of distinct integers, nums, return all possible subsets_N (the power set).

        Note: The solution set must not contain duplicate subsets_N.

        For example,
        If nums = [1,2,3], a solution is:

        [
        [3],
        [1],
        [2],
        [1,2,3],
        [1,3],
        [2,3],
        [1,2],
        []
        ]*/
public class Solution {
    public List<List<Integer>> subsets(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, res, new ArrayList<>(), 0);

        return res;
    }

    private void backtrack(int[] nums, List<List<Integer>> res, List<Integer> temp, int start){
        res.add(new ArrayList<>(temp));
        for(int i=start;i< nums.length;i++){
            temp.add(nums[i]);
            backtrack(nums, res, temp, i+1);
            temp.remove(temp.size()-1);
        }

    }
}
