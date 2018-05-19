package LeetCode.reverseInteger;

public class Solution {
    public int reverse(int x) {
        char[] c = String.valueOf(x).toCharArray();

        int i=0, j=c.length-1;
        if(c[0]=='-')
            i=1;
        while(i<j){
            char t = c[i];
            c[i]= c[j];
            c[j]= t;

            i++;
            j--;
        }

        //return Long.valueOf(new String(c)) > Integer.MIN_VALUE ? 0: Integer.valueOf(new String(c));
        return Integer.valueOf(new String(c));
    }

}
