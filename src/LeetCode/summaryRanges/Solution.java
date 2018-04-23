package LeetCode.summaryRanges;

import java.util.ArrayList;
import java.util.List;

/*
Input: [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
 */
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res= new ArrayList<>();
        if(nums == null)
            return res;
        if(nums.length==0)
            return res;


        StringBuilder t = new StringBuilder();
        t.append(nums[0]);
        int start = nums[0];
        for(int i=1;i< nums.length;i++){
            if(nums[i]> nums[i-1]+1){
                if(start != nums[i-1])
                    t.append("->"+nums[i-1]);
                res.add(t.toString());
                t.delete(0,t.length());
                t.append(nums[i]);
                start = nums[i];
            }
        }
        if(t.length()>0){
            if(start != nums[nums.length-1])
                t.append("->"+nums[nums.length - 1]);
            res.add(t.toString());
        }


        return res;
    }
}
