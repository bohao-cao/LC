package LeetCode.palindromicSubstrings;

//This can be optimized by combining singleCenter and doubleCenter together
public class Solution {
    public int countSubstrings(String s) {
        int res = 0;
        res+= singleCenter(s);
        if(s.length() > 1)
            res+= doubleCenter(s);
        return res;

    }

    private int singleCenter(String s){
        int count = 0;
        for(int i=0;i< s.length();i++){
            count++;
            int m = i-1;
            int n = i+1;
            while(m>=0 && n< s.length()){
                if(s.charAt(m) == s.charAt(n)){
                    count++;
                    m--;
                    n++;
                }
                else
                 break;
            }
        }
        return count;
    }
    private int doubleCenter(String s){
        int count = 0;
        for(int i=0,j=1; j<s.length(); i++,j++){
            if(s.charAt(i)!=s.charAt(j))
                continue;
            count++;
            int m = i-1, n=j+1;
            while(m>=0 && n<s.length()){
                if(s.charAt(m)==s.charAt(n)){
                    count++;
                    m--;
                    n++;
                }
                else
                    break;

            }
        }
        return count;
    }


}
