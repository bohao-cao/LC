package LeetCode.generateParentheses;

import java.util.ArrayList;
import java.util.List;

class LCSolution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        System.out.println(c);
        return ans;
    }
    static int c = 0;

    public void backtrack(List<String> ans, String cur, int open, int close, int max){
        c++;
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);
    }
}