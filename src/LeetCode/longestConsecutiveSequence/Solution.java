package LeetCode.longestConsecutiveSequence;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    // I checked the solution
    public int longestConsecutive(int[] nums) {
        //HashSet<Integer> set = new HashSet(Arrays.asList(nums));
        HashSet<Integer> set = new HashSet();
        for(int n: nums)
            set.add(n);
        int res = 0;
        for(int n:nums){
            if(!set.contains(n-1)){
                int k = n;
                int count =0;
                while(set.contains(k)){
                    k++;
                    count++;
                }
                res = Math.max(count, res);
            }
        }
        return res;
    }
}
