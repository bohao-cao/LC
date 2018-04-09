package LeetCode.longestCommonPrefix;

import java.util.Objects;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return null;
        if(Objects.equals(strs[0],""))
            return strs[0];
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i< strs[0].length()){
            char c = strs[0].charAt(i);
            for(int j=1;j< strs.length;j++){
                if(strs[j].length()-1 < i)
                    return sb.toString();
                if(strs[j].charAt(i) != c)
                    return sb.toString();
            }
            sb.append(c);
            i++;
        }

        return sb.toString();

    }
}
