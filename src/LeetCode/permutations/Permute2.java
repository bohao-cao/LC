package LeetCode.permutations;

import java.util.ArrayList;
import java.util.List;

/*
        Interview Questions

        General questions like "talk about a project that showcases your coding ability", "talk about a project where you worked with a team"
        Answer Question
        Print out all combinations from an array or arrays.

        Example:
        Input: [ [ a, b ], [ c, d, e ], [ f, g ] ]
        Output:
        acf
        acg
        bcf
        bcg
        ...
        aeg

        */
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
