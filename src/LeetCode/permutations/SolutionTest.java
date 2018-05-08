package LeetCode.permutations;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void permuteTest() {
        Solution s = new Solution();
        List<List<Integer>> res = s.permute(new int[]{1,2,3});
        HashSet<Integer> hs = new HashSet();
    }

    @Test
    void permute2Test(){
        List<List<Character>> input = new ArrayList<>();
        input.add(new ArrayList(){{add('a'); add('b');}});
        input.add(new ArrayList(){{add('c'); add('d');add('e');}});
        input.add(new ArrayList(){{add('f'); add('g');}});
        Permute2 solution = new Permute2();
        solution.Solution(input);

    }

}