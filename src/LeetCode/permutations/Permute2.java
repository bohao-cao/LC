package LeetCode.permutations;

import java.util.ArrayList;
import java.util.List;

public class Permute2 {
    public void Solution(List<List<Character>> input){
        backtrack(input, new ArrayList<>(), 0);
    }

    private void backtrack(List<List<Character>> input, List<Character> tempList, int n){
        if(tempList.size()==input.size()){
            System.out.println(tempList);
            return;
        }
        for(int i=0;i< input.get(n).size();i++){
            tempList.add(input.get(n).get(i));
            backtrack(input, tempList, n+1);
            tempList.remove(tempList.size()-1);
        }

    }
}
