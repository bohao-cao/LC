package Sort;

public class SolutionInPlace {
    public int[] sort(int[] input){
        for(int i = input.length -1 ;i>=0;i--){
            if(input[i]<0)
                continue;
            if(input[i]>0){
                int j = i+1;
                while(j < input.length && input[j] <= 0){
                    int t = input[j];
                    input[j] = input[j-1];
                    input[j-1]=t;
                    j++;
                }
            }
        }

        for(int i = 0;i< input.length;i++){
            if(input[i]== 0){
                int j= i+1;
                while(j< input.length && input[j] <= 0){
                    int t = input[j];
                    input[j] = input[j-1];
                    input[j-1] = t;
                    j++;
                }
            }
        }

        return input;

    }

    public int[] sortOnePass(int[] input){
        for(int i =0;i< input.length;i++){
            if(input[i]<0){
                int j = i-1;
                while(j>=0 && input[j]>=0){
                    swap(input, j, j+1);
                    j--;
                }
            }
            else if(input[i]==0){
                int j= i-1;
                while(j>=0 && input[j]>0){
                    swap(input, j,j+1);
                    j--;
                }
            }
        }

        return input;
    }

    private void swap(int[] input, int i, int j){
        int t = input[i];
        input[i] = input[j];
        input[j] = t;
    }
}
