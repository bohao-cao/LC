package LeetCode.happyNumber;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n){
        HashSet<Integer> hs = new HashSet();

        while(n != 1){
            int i = n;
            int j = n;
            int t = 0;
            while(i != 0){
                j = i%10;
                t += j*j;
                i = i/10;
            }
            if(hs.contains(t))
                return false;
            hs.add(t);
            n = t;
        }

        return true;
    }
}
