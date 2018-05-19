package LeetCode.topKFrequentElements;

import java.util.*;

//TODO: bucket is not necessary fro the initial map create a heap
//check this https://leetcode.com/problems/top-k-frequent-elements/discuss/81635/3-Java-Solution-using-Array-MaxHeap-TreeMap
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        //key-nums, v-frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        //O(N)
        for(int i: nums){
           map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i: map.keySet()){
            int f = map.get(i);//f -frequency
            if(bucket[f] == null)
                bucket[f]=new ArrayList<>();
            bucket[f].add(i);
        }

        List<Integer> res = new ArrayList<>();

        int i=bucket.length-1;
        while(k-->0){
            while(i>=0 && bucket[i]==null)
                i--;
            res.addAll(bucket[i]);
            //This line is important: when bucket has more than 1 item, k should decrement the size of the bucket,
            //However, since k has already been decremented once in the while loop, make sure to add back 1.
            k-=bucket[i].size()-1;
            i--;
        }


       return res;
    }
}
