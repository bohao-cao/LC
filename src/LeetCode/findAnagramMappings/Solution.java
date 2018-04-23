package LeetCode.findAnagramMappings;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        //key-value of A, value- index of A
        HashMap<Integer,Integer> aMap = new HashMap<>();
        int[] res = new int[A.length];
        for(int i=0;i<B.length;i++){
            aMap.put(B[i],i);
        }
        for(int i=0;i<A.length;i++){
            res[i]=aMap.get(A[i]);
        }
        HashSet<Integer> h = new HashSet<>();
        
        return res;

    }
}
