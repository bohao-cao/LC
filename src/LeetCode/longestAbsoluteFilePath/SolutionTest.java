package LeetCode.longestAbsoluteFilePath;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void studyLastIndexOf(){
        String s = "\t\tabc";
        int idx= s.lastIndexOf("\t");

    }
    @Test
    void lengthLongestPath() {
        LCSolution s = new LCSolution();
        int res = s.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext");
    }

    @Test
    void lengthLongestPath2() {
        LCSolution s = new LCSolution();
        int res = s.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext");
    }

    @Test
    void lengthLongestPathMySol() {
        Solution s = new Solution();
        int res = s.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext");
    }

    @Test
    void lengthLongestPath2MySol() {
        Solution s = new Solution();
        int res = s.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext");
    }

}