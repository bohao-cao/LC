package LeetCode.strStr;

//Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
public class Solution {

    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null)
            return -1;
        if(needle.length() > haystack.length())
            return -1;
        if(needle.isEmpty() || haystack.isEmpty())
            return 0;
        //i - source, j - target
        int i = 0, j = 0;

        while(i < haystack.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                if(j == needle.length() - 1)
                    return i - needle.length() + 1;
                i++;
                j++;
                continue;
            }

            else if(haystack.charAt(i) != needle.charAt(j)){
                i = i - j + 1;
                j = 0;
            }
        }

        return -1;
    }
}
