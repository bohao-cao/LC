package Wayfair.NoteCombine;

import java.util.HashMap;

//input, 40-10000
//can only use 20,50,100
//return least number of notes
public class Solution {
    public int NoteCombine(int input){
        _map = new HashMap<>();
        int ret = Recurse(input);
        return ret;

    }

    private HashMap<Integer, Integer> _map;
    private int Recurse(int n){
        if(n < 20 || n== 30)
            return Integer.MAX_VALUE;
        if(n == 20 || n == 50 || n==100){
            _map.put(n, 1);
            return 1;
        }
        int s1 = _map.containsKey(n-20)? _map.get(n-20) : Recurse(n-20);
        int s2 = _map.containsKey(n-50)? _map.get(n-50) : Recurse(n-50);
        int s3 = _map.containsKey(n-100)? _map.get(n-100) : Recurse(n-100);

        int v = Math.min(Math.min(s1, s2), s3) + 1;
        _map.put(n,v);

        return v;
    }
}
