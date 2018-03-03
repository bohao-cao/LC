package LintCode.strStr;

//For a given source string and a target string, you should output the first index(from 0) of target string in source string.
//
//        If target does not exist in source, just return -1.
public class Solution {
    /*
     * @param source: source string to be scanned.
     * @param target: target string containing the sequence of characters to match
     * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
     */
    //bcao intuitive solution
    public int strStr(String source, String target) {
        if(source == null || target == null)
            return -1;
        if(target.length() > source.length())
            return -1;
        if(target == "")
            return 0;
        //i - source, j - target
        int i = 0, j = 0;

        while(i < source.length()){
            if(source.charAt(i) == target.charAt(j)){
                if(j == target.length() - 1)
                    return i - target.length() + 1;
                i++;
                j++;
                continue;
            }

            else if(source.charAt(i) != target.charAt(j)){
                i = i - j + 1;
                j = 0;
            }
        }

        return -1;
    }
}
