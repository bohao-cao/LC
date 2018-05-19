package LeetCode.longestConsecutiveSequence;
import java.util.Arrays;
import java.util.HashSet;

/*
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

Your algorithm should run in O(n) complexity.
which means cannot use comparison based sort
Example:

Input: [100, 4, 200, 1, 3, 2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 */
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
