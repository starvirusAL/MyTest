package homework2;

public class Cell {
    public static String representCell(int value) {
        if (value == 1) return "@";
        if (value == 2) return "X";
        return ".";
    }

    public static void writeCell(int array[][]) {
        System.out.print("|Y|");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("|%s|", i);
        }
        System.out.print("- X");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%n|%s|", i);
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("|%s|", representCell(array[i][j]));
            }
        }
        System.out.printf("%n------------------%n");
    }

}
