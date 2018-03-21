package LeetCode.wordLadder;

import java.util.*;

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        boolean[] visited = new boolean[wordList.size()];
        int depth=1;

        while(!q.isEmpty()){
            int size = q.size();
            depth++;
            while(size-->0){
                String word = q.poll();
                for(int i=0;i< wordList.size();i++){
                    String w = wordList.get(i);
                    if(!visited[i] && isMatch(word, w)){
                        if(Objects.equals(endWord, w))
                            return depth;
                        q.add(w);
                        visited[i]=true;
                    }
                }
            }

        }
        return 0;
    }

    public boolean isMatch(String word, String word2){
        int[] map = new int[26];
        Arrays.fill(map,0);
        char[] w1 = word.toCharArray();
        char[] w2 = word2.toCharArray();

        for(int i=0;i< w1.length;i++){
            map[w1[i]-'a']++;
            map[w2[i]-'a']--;
        }

        int count=0;
        for(int i=0;i< map.length;i++){
            if(map[i] !=0)count++;
        }

        return count==2;
    }
}
