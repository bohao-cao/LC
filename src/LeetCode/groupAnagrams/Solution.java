package LeetCode.groupAnagrams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/group-anagrams/description/
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap();
        for (String s : strs) {
            char[] x = s.toCharArray();
            Arrays.sort(x);
            String key = new String(x);
            if(!map.containsKey(key))
                map.put(key, new ArrayList());

                map.get(key).add(s);
        }

        return new ArrayList(map.values());
    }
}
