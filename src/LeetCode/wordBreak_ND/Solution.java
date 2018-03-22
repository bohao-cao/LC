package LeetCode.wordBreak_ND;
import java.util.Arrays;
import java.util.List;
/*Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words. You may assume the dictionary does not contain duplicate words.

        For example, given
        s = "leetcode",
        dict = ["leet", "code"].

        Return true because "leetcode" can be segmented as "leet code".

        UPDATE (2017/1/4):
        The wordDict parameter had been changed to a list of strings (instead of a set of strings). Please reload the code definition to get the latest changes.*/
public class Solution {
    //Solution1 bfs
    //Solution2 dynamic programming
    public boolean wordBreak(String s, List<String> wordDict) {
        return dpSolution(s, wordDict);

    }

    private boolean dpSolution(String s, List<String> wordDict){
        boolean[]dp= new boolean[s.length()+1];
        Arrays.fill(dp, false);
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            boolean found = false;
            for(int j=0;j<i;j++){
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    found = true;
                    break;
                }
            }
            dp[i] = found;
        }
        return dp[s.length()];
    }

}
