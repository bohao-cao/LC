package LeetCode.setMatrixZeroes;

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
