package LintCode.backpack;

public class Solution {

    // write your code here
    public int backPack(int m, int[] A) {
        // write your code here
        int aLength = A.length;

        boolean[][] ret = new boolean[aLength+1][m+1];

        //Arrays.fill(ret, false);


        ret[0][0] = true;

        for(int i=1;i< aLength+1;i++){
            for(int j=0;j< m+1;j++){
                boolean first = j-A[i-1] >=0;
                ret[i][j]= ret[i-1][j] || (first && ret[i-1][j-A[i-1]]);

            }
        }

        for (int i = m ; i >= 0; i--) {
            if (ret[A.length][i] == true)
                return i;
        }
        return 0;
    }

}
