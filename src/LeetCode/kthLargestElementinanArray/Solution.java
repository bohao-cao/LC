package LeetCode.kthLargestElementinanArray;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
https://leetcode.com/problems/kth-largest-element-in-an-array/description/
*
* Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order,
* not the kth distinct element.
For example,
Given [3,2,1,5,6,4] and k = 2, return 5.

Note:
You may assume k is always valid, 1 ≤ k ≤ array's length.
* */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Comparator<Integer> myComparator = new MyComparator();
        Queue<Integer> pq = new PriorityQueue<Integer>(myComparator);

        for(int i:nums)
            pq.add(i);

        while(k-->0){
            pq.poll();
        }
        return pq.poll();
    }

    private class MyComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            if(o1==o2)
                return 0;
            return o1<o2?1:-1;
        }
    }
}
