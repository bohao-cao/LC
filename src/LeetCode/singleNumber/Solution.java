package LeetCode.singleNumber;

/*Given an array of integers, every element appears twice except for one. Find that single one.
   Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?*/
public class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        int sum2=0;
        for(int n:nums){
            sum+=n;
            sum2=sum2+n+n;
        }
        return sum2-sum;
    }
}
