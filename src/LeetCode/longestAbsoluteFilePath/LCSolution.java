package LeetCode.longestAbsoluteFilePath;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Suppose we abstract our file system by a string in the following manner:

        The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:

        dir
            subdir1
            subdir2
                file.ext
        The directory dir contains an empty sub-directory subdir1 and a sub-directory subdir2 containing a file file.ext.

        The string "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext" represents:

        dir
            subdir1
                file1.ext
                subsubdir1
            subdir2
                subsubdir2
                    file2.ext
        The directory dir contains two sub-directories subdir1 and subdir2. subdir1 contains a file file1.ext and an empty second-level sub-directory subsubdir1. subdir2 contains a second-level sub-directory subsubdir2 containing a file file2.ext.

        We are interested in finding the longest (number of characters) absolute path to a file within our file system. For example, in the second example above, the longest absolute path is "dir/subdir2/subsubdir2/file2.ext", and its length is 32 (not including the double quotes).

        Given a string representing the file system in the above format, return the length of the longest absolute path to file in the abstracted file system. If there is no file in the system, return 0.

        Note:
        The name of a file contains at least a . and an extension.
        The name of a directory or sub-directory will not contain a ..
        Time complexity required: O(n) where n is the size of the input string.

        Notice that a/aa/aaa/file1.txt is not the longest file path, if there is another path aaaaaaaaaaaaaaaaaaaaa/sth.png.
*/
public class LCSolution {


    public  int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);  // Layer 0, dummy head
        int maxLen = 0;
        for(String s : input.split("\n")) {
            int layer = s.lastIndexOf("\t") + 1;    // e.g. Layer 2 s: "\t\tsubsubdir1"
            while(layer < stack.size() - 1)
                stack.pop();
            int length = stack.peek() + s.length() - layer + 1; // remove "\t\t..." add "\"
            if(layer == 0)  // dir has no "\t" in the front
                length--;
            if(s.contains("."))
                maxLen = Math.max(maxLen, length);
            else
                stack.push(length);
        }
        return maxLen;
    }

}
