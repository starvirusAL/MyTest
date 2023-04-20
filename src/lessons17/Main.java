package lessons17;

public class Main {
    static int max(int[] xs) {
        if (xs.length == 0){
            throw new IllegalArgumentException("array is empty");
        }
        int max = xs[0];
        for (int x : xs){
            if (x > max) max = x;
        }
        return max;
    }

    static  String doSomething(int[] xs) throws IllegalArgumentException{
        try {
            int x = max(xs);
            return String.format("The max element of the array is %s", x);

        } catch (IllegalArgumentException ex){
            return "The given array is empty";
        }

    }

    public static void main(String[] args) {
      String massage = doSomething(new int[]{});
        System.out.println(massage);
    }
}
