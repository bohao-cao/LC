package Amazon.isBalanced;

import java.util.Stack;

public class Solution {
    public String isBalanced(String s) {
        // Complete this function
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack();
        for(char c : arr){
            if(c=='['||c=='('||c=='{')
                stack.push(c);
            else{
                if(stack.isEmpty())
                    return "NO";
                char m = stack.pop();
                if(c!=']'&& m=='[' || c!='}'&& m=='{'||c!=')'&& m=='(')
                    return "NO";
            }
        }
        if(stack.isEmpty())
            return "YES";
        else
            return "NO";
    }
}
