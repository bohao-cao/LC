package LeetCode.wordLadder;

import java.util.*;

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        ArrayList<String> myWordList = new ArrayList<>(wordList);
        Queue<Integer> q = new LinkedList();
        myWordList.add(beginWord);
        int[] level = new int[myWordList.size()];
        Arrays.fill(level, 0);
        level[myWordList.size()-1]=1;
        q.add(myWordList.size()-1);
        boolean[] visited = new boolean[myWordList.size()];
        visited[myWordList.size()-1]=true;
        while(!q.isEmpty()){
            int idx = q.poll();
            String w = myWordList.get(idx);
            for(int i=0;i<myWordList.size();i++) {
                String word = myWordList.get(i);
                if (visited[i] == false && isOK(word, w)) {
                    if (Objects.equals(word, endWord))
                        return level[idx] + 1;
                    q.add(i);
                    level[i] = level[idx] + 1;
                    visited[i] = true;
                }
            }
        }
        return 0;
    }

    private boolean isOK(String word, String word2){
        int[] map = new int[26];
        Arrays.fill(map,0);
        char[] w1 = word.toCharArray();

        char[] w2 = word2.toCharArray();

        for(char w: w1){
            map[w-'a']++;
        }

        for(char w: w2){
            map[w-'a']--;
        }

        int count=0;
        for(int i:map){
            if(i!=0)
                count++;
        }
        return count==2;
    }
}
