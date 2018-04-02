package LeetCode.combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        res = new ArrayList<>();
        backtrack(candidates, target, 0,0, new ArrayList<>());
        return res;

    }

    private void backtrack(int[] c, int target, int sum, int start, List<Integer> tempList ){
        if(sum > target)
            return ;
        for(int i= start; i< c.length;i++){
            tempList.add(c[i]);
            sum+=c[i];
            if(sum==target){
                res.add(new ArrayList(tempList));
            }
            else
                backtrack(c, target, sum,i, tempList);


            sum-=c[i];
            tempList.remove(tempList.size()-1);
        }
    }
}
