import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collection {

    public static Map<Character, Integer> countLetters(String s){
        Map<Character, Integer> hashMap = new HashMap<>() ;
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.toCharArray()[i];
            if(hashMap.containsKey(s1)){
                hashMap.replace(s1, hashMap.get(s1)+1);
            }else hashMap.put(s1,1);
        }
        return hashMap;
    }

    public static void main(String[] args) {
        String s  = "Hello world!";

        System.out.println(countLetters(s));
    }


}
