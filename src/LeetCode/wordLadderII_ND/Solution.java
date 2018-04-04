package LeetCode.wordLadderII_ND;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        temp.add(beginWord);
        backtrack(wordList, res, temp, endWord, Integer.MAX_VALUE);

        int shortestLength=Integer.MAX_VALUE;
        for(List<String> l: res){
            if(l.size() < shortestLength)
                shortestLength = l.size();
        }

        List<List<String>> theRes = new ArrayList<>();

        for(List<String> l : res){
            if(l.size() == shortestLength)
                theRes.add(l);
        }

        return  theRes;

    }

    private void backtrack(List<String> wordList, List<List<String>> res, List<String> temp, String endWord, int length){
        if(Objects.equals(temp.get(temp.size()-1), endWord)){
            length = length > temp.size()? temp.size():length;
            res.add(new ArrayList(temp));
            return;
        }

        for(String s : wordList){
            if(!temp.contains(s) && isMatch(temp.get(temp.size()-1), s) && temp.size() < length){
                temp.add(s);
                backtrack(wordList, res, temp, endWord, length);
                temp.remove(s);
            }
        }
    }

    //assume a and b length is the same
    private boolean isMatch(String a, String b){
        char[] aC = a.toCharArray();
        char[] bC = b.toCharArray();
        int diff = 0;
        for(int i=0;i< a.length();i++){
            if(!Objects.equals(aC[i], bC[i]))
                diff++;
        }

        return diff==1;

    }
}
