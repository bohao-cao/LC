package LeetCode.topKFrequentElements;

import java.util.*;

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        //key-nums, v-frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
           map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i: map.keySet()){
            int f = map.get(i);
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
