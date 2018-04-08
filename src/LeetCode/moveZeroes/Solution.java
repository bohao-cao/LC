package LeetCode.moveZeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int p0=0, p=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=0){
                while(p0< i && nums[p0]!=0)
                    nums[p0]++;
                int t = nums[p0];
                nums[p0]=nums[i];
                nums[i]=t;
                p0++;
            }
        }

    }
}
