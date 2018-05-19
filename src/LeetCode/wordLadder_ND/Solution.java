package LeetCode.wordLadder_ND;

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
                    if(!visited[i] && isAMatch(word, w)){
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
    private HashMap<String,HashSet<String>> matchedPairs = new HashMap();
    private boolean isAMatch(String word, String word2){
        if((matchedPairs.containsKey(word) && matchedPairs.get(word).contains(word2)) || (matchedPairs.containsKey(word2) && matchedPairs.get(word2).contains(word)))
            return true;
        char[] aC = word.toCharArray();
        char[] bC = word2.toCharArray();
        int diff = 0;
        for(int i=0;i< word.length();i++){
            if(!Objects.equals(aC[i], bC[i]))
                diff++;
        }

        if(diff==1){
            if(matchedPairs.get(word) == null){
                HashSet<String> h = new HashSet<>();
                h.add(word2);
                matchedPairs.put(word, h);
            }
            else{
                matchedPairs.get(word).add(word2);
                matchedPairs.put(word, matchedPairs.get(word));
            }

            if(matchedPairs.get(word2) == null){
                HashSet<String> h = new HashSet<>();
                h.add(word);
                matchedPairs.put(word2, h);
            }
            else{
                matchedPairs.get(word2).add(word);
                matchedPairs.put(word2, matchedPairs.get(word2));
            }
            return true;
        }
        return false;

    }


    public boolean isMatch(String word, String word2){
        if((matchedPairs.containsKey(word) && matchedPairs.get(word).contains(word2)) || (matchedPairs.containsKey(word2) && matchedPairs.get(word2).contains(word)))
            return true;
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
        if(count == 2){
            if(matchedPairs.get(word) == null){
                HashSet<String> h = new HashSet<>();
                h.add(word2);
                matchedPairs.put(word, h);
            }
            else{
                matchedPairs.get(word).add(word2);
                matchedPairs.put(word, matchedPairs.get(word));
            }

            if(matchedPairs.get(word2) == null){
                HashSet<String> h = new HashSet<>();
                h.add(word);
                matchedPairs.put(word2, h);
            }
            else{
                matchedPairs.get(word2).add(word);
                matchedPairs.put(word2, matchedPairs.get(word2));
            }
            return true;
        }
        return false;
    }
}
