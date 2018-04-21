package LeetCode.queueReconstructionByHeight;

import java.util.*;

//Input:
//[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
//
//Output:
//[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        //List<int[]> people =
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        LinkedList<int[]> res = new LinkedList<>();

        for(int[] person: people){
            res.add(person[1], person);
        }

        return res.toArray(new int[people.length][]);
    }
}
