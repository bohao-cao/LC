package Common;


import org.junit.jupiter.api.Test;

import java.util.*;


public class MapIterationStudy {

    @Test
    void iterateMap() {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);


        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
        }

        for(int entry: map.keySet()){
            int key = entry;

        }
        for(int entry: map.values()){
            int value = entry;

        }
    }
}
