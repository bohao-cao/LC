package LeetCode.singleNumber;

import java.util.HashSet;

/*Given an array of integers, every element appears twice except for one. Find that single one.
   Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?*/
public class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int sum2 =0;
        for(int n:nums){
            sum += n;
            if(set.contains(n))
                continue;
            else{
                set.add(n);
                sum2 +=n;
            }

        }
        return 2*sum2 - sum;
    }
}
