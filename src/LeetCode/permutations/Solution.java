package LeetCode.permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        backtrack(res, nums, new ArrayList<>());

        return res;

    }

    private void backtrack(List<List<Integer>> res, int[]nums, List<Integer> tempList){
        if(tempList.size() == nums.length){
            res.add(new ArrayList<>(tempList));
            return;
        }


        for(int i=0;i<nums.length;i++){
            if(tempList.contains(nums[i]))continue;
            tempList.add(nums[i]);
            backtrack(res, nums,tempList);
            tempList.remove(tempList.size()-1);
        }
    }
}
