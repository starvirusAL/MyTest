package lessons11;

import java.util.List;

public class ApllesAndOranges {

    static boolean inRange(int pos, int l, int r) {
        return pos >= l && pos < r;
    }

    static int count(List<Integer> distances, int center, int l, int r) {
        int counter = 0;
        for (int distance : distances) {
            int pos = center + distance;


            counter +=inRange(pos, l,r)? 1: 0;
        }
        return counter;
    }

    public static void countApplesAndOranges(
            int s, int t, int a, int b,
            List<Integer> apples,
            List<Integer> oranges) {


        int ac = count(apples,a,s,t);
        int oc = count(oranges,b,s,t);
        System.out.printf("%d\n%d\n", ac, oc);
        }

    }



