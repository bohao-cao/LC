package LeetCode.islandPerimeter;

public class Solution {
    public int IslandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i =0;i< grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                if(grid[i][j]==1){
                    int p = 4-AdjacentCellCount(grid, i,j);
                    System.out.println(i+","+j+","+p);
                    perimeter += (p);
                }
            }
        }
        return perimeter;
    }

    private int AdjacentCellCount(int[][] grid, int i, int j){
        int res = 0;

        if(i-1 >=0 && grid[i-1][j]==1) res++;
        if(i+1 < grid.length && grid[i+1][j]==1) res++;
        if(j+1 < grid[0].length && grid[i][j+1]==1) res++;
        if(j-1 >=0 && grid[i][j-1]==1) res++;

        return res;
    }
}