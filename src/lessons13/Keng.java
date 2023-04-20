package lessons13;

public class Keng {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean t = true;
        while (t) {


            if ((int)(x1 / v1) ==(int) (x2 / v2)) {
                t = false;
                return "YES";
            }


        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
    }
}
