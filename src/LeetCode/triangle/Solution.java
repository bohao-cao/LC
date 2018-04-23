package LeetCode.triangle;

import java.util.ArrayList;
import java.util.List;

/*
For example, given the following triangle

[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> dp = new ArrayList<>();

        for(int i =0;i< triangle.size();i++){
            List<Integer> current = triangle.get(i);
            if(i==0){
                dp.add(0, current.get(0));
                continue;
            }

            List<Integer> t =  new ArrayList(current.size());

            for(int j=0;j< current.size();j++){
                if(j==0)
                    t.add(j, current.get(j) + dp.get(j));
                else if(j==current.size()-1)
                    t.add(j, current.get(j) + dp.get(j-1));
                else
                    t.add(j, current.get(j) + Math.min(dp.get(j-1), dp.get(j)));
            }

            dp = t;
        }

        int min =Integer.MAX_VALUE;
        for(int i: dp)
            min = Math.min(min, i);

        return min;

    }
}
