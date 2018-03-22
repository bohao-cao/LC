package LeetCode.baseballGame;

import java.util.*;

public class Solution {
    public int calPoints(String[] ops) {

        Stack<Integer> s = new Stack<>();

        for(String op: ops){
            if(op=="+"){
                int top = s.pop();
                int nextTop = s.peek();

                s.push(top);
                s.push(top+nextTop);
            }

            else if(op=="D"){
                s.push(2*s.peek());
            }
            else if(op=="C")
                s.pop();
            else
                s.push(Integer.valueOf(op));
        }

        int ret = 0;
        for(int v : s){
            ret+=v;
        }

        return ret;

    }
}
