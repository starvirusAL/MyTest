package homework2;

public class Board {
    public static void shotBord(int[][] array, int x, int y, int xB, int yB) {
        try {
            array[x][y] = 1;
            if (array[xB][yB] == 1) {
                System.out.println(array[xB][yB]);
                array[xB][yB] = 2;
            }
        } catch (Exception ex) {
            System.out.println("Unavailable point. Try again!");
        }
    }
    public static void bombBoard(int array[][], int x, int y, int xB, int yB) {
        try {
        array[x][y] = 1;
        if (x > 0) {
            array[x - 1][y] = 1;
        }
        if (y > 0) {
            array[x][y - 1] = 1;
        }
        if (y < 4) {
            array[x][y + 1] = 1;
        }
        if (x < 4) {
            array[x + 1][y] = 1;
        }

        if (x > 0 && y > 0) {
            array[x - 1][y - 1] = 1;
        }
        if (x > 0 && y < 4) {
            array[x - 1][y + 1] = 1;
        }
        if (x < 4 && y > 0) {
            array[x + 1][y - 1] = 1;
        }
        if (x < 4 && y < 4) {
            array[x + 1][y + 1] = 1;
        }
        if (array[xB][yB] == 1) {
            System.out.println(array[xB][yB]);
            array[xB][yB] = 2;
        }
    }catch (Exception ex) {
               System.out.println("Unavailable point. Try again!");
        }
    }
}
