package lessons12;

import java.util.HashMap;
import java.util.Map;


public class CountLetters {
    static Map<Character, Integer> countLetters(String line) {
        Map<Character, Integer> outcome = new HashMap<>();
        for (char c : line.toCharArray()) {
                int count = outcome.getOrDefault(c, 0)  ;
                outcome.put(c, count+1);
        }
        return outcome;
    }
    static Map<Character, Integer> countLetters1(String line) {
        Map<Character, Integer> outcome = new HashMap<>();

        for (char c : line.toCharArray()) {
           outcome.merge(c,1,Integer::sum); //((a,b) -> a+b)
        }
        return outcome;
    }
    static Map<Character, Integer> countLetters2(String line) {
        Map<Character, Integer> outcome = new HashMap<>();
        Counter counter =new Counter();
        for (char c : line.toCharArray()) {
            counter.count(c);
        }
        return counter.get();
    }







    public static void main(String[] args) {
        String line = "Hello World!";
        System.out.println(countLetters(line));
    }
}
