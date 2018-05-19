package LeetCode.setMatrixZeroes;

/*
Given a m x n matrix, if an element is 0,
set its entire row and column to 0. Do it in-place.

Example 1:

Input:
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
Output:
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]
Example 2:

Input:
[
  [0,1,2,0],
  [3,4,5,2],
  [1,3,1,5]
]
Output:
[
  [0,0,0,0],
  [0,4,5,0],
  [0,3,1,0]
]
Follow up:

A straight forward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?

 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                if(matrix[i][j]==0){
                    int t = i+1;
                    while(t < matrix.length){
                        if(matrix[t][j]!= 0)
                            matrix[t][j]=-997;
                        t++;
                    }
                    t=i-1;
                    while(t>=0){
                        if(matrix[t][j]!= 0)
                            matrix[t][j]=-997;
                        t--;
                    }
                    t=j+1;
                    while(t<matrix[0].length){
                        if(matrix[i][t]!=0)
                            matrix[i][t]=-997;
                        t++;
                    }
                    t=j-1;
                    while(t>=0){
                        if(matrix[i][t]!=0)
                            matrix[i][t]=-997;
                        t--;
                    }
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                if(matrix[i][j]==-997)
                    matrix[i][j]=0;
            }
        }


    }
}
