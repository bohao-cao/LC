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
}
