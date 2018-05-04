package Sort;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int[] sort(int[] input){
        Queue<Integer> negatives = new ArrayDeque<>();
        Queue<Integer> positives = new ArrayDeque<>();
        int zeroCount = 0;
        for(int i: input){
            if(i==0)
                zeroCount++;
            else if(i<0)
                negatives.add(i);
            else
                positives.add(i);
        }
        int i=0;
        while (!negatives.isEmpty())
            input[i++]=negatives.poll();
        while(zeroCount-- > 0)
            input[i++]=0;
        while(!positives.isEmpty())
            input[i++]=positives.poll();

        return input;
    }
}
