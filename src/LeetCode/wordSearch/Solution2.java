package LeetCode.wordSearch;

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
public class Solution2 {
    public boolean exist(char[][] board, String word){
        for(int i=0;i<board.length;i++){
            for(int j=0;j< board[0].length;j++){
                if(word.charAt(0)==board[0][0] && search(board, i, j, word, 0, new boolean[board.length][board[0].length]));
                return true;
            }
        }
        return false;
    }

    private boolean search(char[][] board, int i, int j, String word, int wordIdx, boolean[][] visited){
        if(wordIdx == word.length())
            return true;
        if( i<0 || i >= board.length || j<0 || j>=board[0].length|| board[i][j] != word.charAt(wordIdx) || visited[i][j])
            return false;

        visited[i][j]=true;
        boolean res = search(board, i-1, j, word, wordIdx+1, visited) || search(board, i+1, j-1, word, wordIdx+1, visited) || search(board, i, j-1, word,  wordIdx+1,  visited) || search(board, i, j+1, word, wordIdx+1, visited);
        if(res)
            return res;
        visited[i][j]= false;
        return false;
    }
}
