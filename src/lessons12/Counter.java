package lessons12;

import java.util.HashMap;
import java.util.Map;

public class Counter<Character> {

    private final Map<Character, Integer> data = new HashMap<>();
    public void count (Character c){
        data.merge(c,1, Integer::sum);

    }
    public Map<Character,Integer> get(){
        return data;
    }
}
