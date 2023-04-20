package libs;

public class OutputArray {
    public static void arrayOutput(String array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);

            }


        }
    }
    public static void arrayOutput(String array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
