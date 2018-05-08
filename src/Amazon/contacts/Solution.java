package Amazon.contacts;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] contacts(String[][] queries) {
        /*
         * Write your code here.
         */
        List<Integer> res = new ArrayList();
        List<String> l = new ArrayList();
        for(int i=0;i< queries.length;i++){
            if(queries[i][0]=="add")
                l.add(queries[i][1]);
            else if(queries[i][0]=="find"){
                int r = 0;
                for(String s:l)
                    if(s.startsWith(queries[i][1]))
                        r++;
                res.add(r);

                System.out.println(r);
            }
        }
        int[] rr = new int[res.size()];
        int i=0;
        for(int r:res)
            rr[i++]=r;
        return rr;
    }
}
