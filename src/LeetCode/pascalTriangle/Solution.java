package LeetCode.pascalTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<= numRows;i++){
            int[] list = new int[i];
            list[0]=1;
            list[list.length-1]=1;

            if(i>2){
                for(int j=1;j<= i-2;j++){
                    list[j]= res.get(i-2).get(j-1) + res.get(i-2).get(j);
                }
            }
            List<Integer> s= new ArrayList();
            for(int item: list)
                s.add(item);
            res.add(i-1, s);
        }
        return res;

    }
}