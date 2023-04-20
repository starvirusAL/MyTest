package lessons12;

import java.util.*;

public class IterableIterator {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int x : arr) {
            System.out.println(x);
        }

        List<Integer> ints = Arrays.asList(2, 2, 3);
        for (int i = 0; i < ints.size(); i++) {
            System.out.println(ints.get(i));
        }
        for (int x : ints){
            System.out.println(x);
        }

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        for (Map.Entry<Integer,String> x : map.entrySet()){
            System.out.println(x);
        }

        for (Iterator<Integer> it = ints.iterator(); it.hasNext(); ){
            int x = it.next();
            System.out.println(x);
        }



    }

}
