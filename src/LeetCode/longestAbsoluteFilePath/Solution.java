package LeetCode.longestAbsoluteFilePath;

import java.util.Stack;

public class Solution {
    public int lengthLongestPath(String input) {
        int level = 1;
        //saves accumulative length up to layer
        Stack<Integer> stack = new Stack<Integer>();

        String[] inputArr = input.split("\n");

        int max = 0;
        for(String s: inputArr){
            level = s.lastIndexOf("\t")+1;
            while(stack.size() > level)
                stack.pop();
            int sLength = s.length()-level;
            int length = stack.isEmpty()? sLength : stack.peek() + sLength;
            if(s.contains("."))// this is a file, calculate length;
                max= Math.max(max, length);
            else
                stack.push(length+1);

        }
        return max;
    }
}
