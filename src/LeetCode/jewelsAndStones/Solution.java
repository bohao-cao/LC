package LeetCode.jewelsAndStones;

import java.util.HashMap;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c: S.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }
            else
                map.put(c, 1);

        }
        int ret = 0;

        for(Character c: J.toCharArray()){
            if(map.containsKey(c))
                ret += map.get(c);
            else
                continue;
        }


        return ret;
    }
}
