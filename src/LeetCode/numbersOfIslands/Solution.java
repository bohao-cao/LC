package LeetCode.numbersOfIslands;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/number-of-islands/solution/
public class Solution {
    public int numIslands(char[][] grid) {
        //return dfsSolution(grid);
        return bfsSolution(grid);
    }

    private int dfsSolution(char[][] grid){
        int ret =0;

        for(int i= 0;i< grid.length;i++){
            for(int j=0;j< grid[i].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid, i,j);
                    ret++;
                }
            }
        }
        return ret;
    }

    private void dfs(char[][] g, int i, int j){
        if(i<0 || i>= g.length || j< 0 || j>= g[0].length)
            return;
        if(g[i][j]=='0')
            return;
        g[i][j]='0';
        dfs(g,i+1,j);
        dfs(g, i-1, j);
        dfs(g, i, j+1);
        dfs(g, i, j-1);

    }

    private int bfsSolution(char[][] g){
        Queue<AbstractMap.SimpleEntry<Integer, Integer>> q= new LinkedList<>();
        int islands = 0;

        for(int i=0; i< g.length; i++){
            for(int j=0;j< g[i].length;j++){
                if(g[i][j]=='1'){
                    q.add(new AbstractMap.SimpleEntry<>(i,j));

                    while(!q.isEmpty()){
                        int s = q.peek().getKey();
                        int t = q.peek().getValue();
                        q.poll();

                        if(s-1>=0 && g[s-1][t]=='1'){
                            g[s-1][t]='0';
                            q.add(new AbstractMap.SimpleEntry<Integer, Integer>(s-1,t));
                        }

                        if(s+1<g.length && g[s+1][t]=='1'){
                            g[s+1][t]='0';
                            q.add(new AbstractMap.SimpleEntry<Integer, Integer>(s+1,t));
                        }

                        if(t+1< g[0].length && g[s][t+1]=='1'){
                            g[s][t+1]='0';
                            q.add(new AbstractMap.SimpleEntry<Integer, Integer>(s,t+1));
                        }

                        if(t-1>=0 && g[s][t-1]=='1'){
                            g[s][t-1]='0';
                            q.add(new AbstractMap.SimpleEntry<Integer, Integer>(s,t-1));
                        }
                    }

                    islands++;
                }
            }
        }

        return islands;
    }
}
