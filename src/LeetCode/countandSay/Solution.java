package LeetCode.countandSay;

public class Solution {
    public String countAndSay(int n) {
       String res = "1";

       while(--n>0){
           int count=1;
           String t = null;
           for(int i=0;i< res.length();i++){
               if(i< res.length()-1 && res.charAt(i)==res.charAt(i+1))
                   count++;
               else{
                   t+= String.valueOf(count) + res.charAt(i);
                   count=1;
               }
           }
           res=t;
       }
       return res;
    }
}
