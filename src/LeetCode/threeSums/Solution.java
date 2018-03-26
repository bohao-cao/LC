package LeetCode.threeSums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList();
        for(int k =0;k< nums.length;k++){
            if(k> 0 && nums[k]==nums[k-1])
                continue;
            int i = k+ 1,j=nums.length-1;

            while(i<j){
                if(nums[i]+nums[j]+ nums[k]>0)
                    j--;
                else if(nums[i]+ nums[j] +nums[k]<0)
                    i++;
                else if(nums[i]+nums[j]+nums[k]==0){
                    ArrayList<Integer> l = new ArrayList();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    res.add(l);
                    j--;
                    i++;
                    while(i< j && nums[j+1]==nums[j])j--;
                    while(i< j && nums[i-1]==nums[i])i++;
                }

            }
        }
        return res;

    }
}
