package LeetCode.combinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        res = new ArrayList<>();
        backtrack(candidates, target, 0, 0, new ArrayList<>());
        return res;
    }
    private void backtrack(int[]c, int target, int start, int sum, List<Integer> tempList){
        if(sum> target)
        {
            return;
        }

        for(int i=start; i<c.length;i++){
            tempList.add(c[i]);
            sum+=c[i];
            if(sum== target)
                res.add(new ArrayList<>(tempList));
            else
                backtrack(c, target, start+1, sum, tempList);

            sum-=c[i];
            tempList.remove(tempList.size()-1);
        }
    }
}
//1,1,2,5,6,7,10