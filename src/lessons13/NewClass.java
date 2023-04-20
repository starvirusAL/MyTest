package lessons13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class NewClass {

    public static void main(String[] args) {
        List<Integer> ints = (new Random()).ints(20, -50, 50).mapToObj(Integer::valueOf).toList();

        System.out.println(ints);
        ArrayList<Integer> data = new ArrayList<>(ints);
        data.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > 0 && o2 > 0) {
                    return o2 - o1;
                }
                return o1 - o2;
            }
        });
        System.out.println(data);

    }
}
