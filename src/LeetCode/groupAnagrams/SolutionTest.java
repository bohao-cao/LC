package LeetCode.groupAnagrams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void groupAnagramsTest() {

        String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
        Solution2 s = new Solution2();
        List<List<String>> ret = s.groupAnagrams(input);
    }

    @Test
    void groupAnagramsTest2() {

        String[] input = new String[]{"chi","nip","lab","mud","fan","yak","kid","lox","joy","rob","cad","hug","ken","oaf","pus","hos","ton","any","sac","mid","nip","ron","tux","set","jug","axe","ago","sob","ode","dot","nit","pug","sue","new","rub","sup","ohs","ski","oaf","don","cob","kin","ark","gay","jay","bur","dot","eat","rca","wad","maj","luz","gad","dam","eon","ark","del","sin","tat"};
        Solution2 s = new Solution2();
        List<List<String>> ret = s.groupAnagrams(input);

    }


}