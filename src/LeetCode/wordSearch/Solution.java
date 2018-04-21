package LeetCode.wordSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
For example,
        Given board =

        [
        ['A','B','C','E'],
        ['S','F','C','S'],
        ['A','D','E','E']
        ]
        word = "ABCCED", -> returns true,
        word = "SEE", -> returns true,
        word = "ABCB", -> returns false.
*/
//My answer is wrong is because I have a wrong understanding of the problem;
//For the example, case 2 is true because the candiates are board[1][3],[2][3],[2][2]
//Order matters
class Solution {

    public boolean exist(char[][] board, String word) {
        List<Character> wordArray = new ArrayList();
        for(char c: word.toCharArray()) {
            wordArray.add(c);
        }

        for(int i=0;i<board.length;i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (wordArray.contains(board[i][j]) && dfs(board, new boolean[board.length][board[0].length], new ArrayList(wordArray), i, j))
                    return true;
            }
        }
        return false;
    }



    private boolean dfs(char[][] board, boolean[][] visited, ArrayList<Character> wordArray, int i,int j){
        if(wordArray.isEmpty())
            return true;
        if(wordArray.contains(board[i][j]) && !visited[i][j]) {
            visited[i][j] = true;
            wordArray.remove((Object)board[i][j]);
            if(wordArray.isEmpty())
                return true;
            if (i - 1 >= 0 && dfs(board, visited, wordArray, i - 1, j))
                return true;
            if (i + 1 < board.length && dfs(board, visited, wordArray, i + 1, j))
                return true;
            if (j - 1 >= 0 && dfs(board, visited, wordArray, i, j - 1))
                return true;
            if (j + 1 < board[0].length && dfs(board, visited, wordArray, i, j + 1))
                return true;
            wordArray.add(board[i][j]);
        }

        return false;
    }


}
