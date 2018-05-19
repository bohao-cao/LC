package LeetCode.generateParentheses;

import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {
    @Test
    void generateParenthesis() {
        LCSolution s = new LCSolution();
        List<String> res = s.generateParenthesis(3);
    }

    @Test
    void generateParenthesisLarge() {
        LCSolution s = new LCSolution();
        List<String> res = s.generateParenthesis(5);
        System.out.println(res.size());
    }

    @Test
    void generateParenthesisLarge2() {
        LCSolution s = new LCSolution();
        List<String> res = s.generateParenthesis(9);
        System.out.println(res.size());
    }

    @Test
    void generateParenthesisLarge3() {
        LCSolution s = new LCSolution();
        List<String> res = s.generateParenthesis(15);
        System.out.println(res.size());
    }

}