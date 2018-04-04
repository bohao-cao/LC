package LeetCode.wordLadderII_ND;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SolutionTest {
    @Test
    void ladderLengthTest3() {
        Solution s = new Solution();
        List ret = s.findLadders("leet", "code", Arrays.asList(new String[]{"lest","leet","lose","code","lode","robe","lost"}));

    }

    @Test
    void findLadderLongList()
    {
        Solution s = new Solution();
        List ret = s.findLadders("qa","sq", Arrays.asList(new String[]{"si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"}));
    }
}