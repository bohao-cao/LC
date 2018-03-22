package LeetCode.groupAnagrams;

import java.util.*;

public class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap();
        for (String s : strs) {
            int[] m = new int[26];
            Arrays.fill(m, 0);

            for(char c: s.toCharArray()){
               m[c-'a']++;

            }

            StringBuilder key = new StringBuilder();
            for(int n:m){
                key.append(String.valueOf(n));
            }

            if(!map.containsKey(key.toString()))
                map.put(key.toString(), new ArrayList<>());
            map.get(key.toString()).add(s);
        }

        return new ArrayList(map.values());
    }
}
