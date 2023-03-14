package homework2;

import java.util.Scanner;

public class BoardBatle {
    public static void main(String[] args) {
        System.out.println("Game start!");
        int array[][] = new int[5][5];
        Scanner scanner = new Scanner(System.in);
        Cell.writeCell(array);
        int xB = (int) (Math.random() * 5);
        int yB = (int) (Math.random() * 5);

        while (array[xB][yB] != 2) {
            System.out.println("Bomb(1) or bullet(2)?");
            int x = 0, y = 0;
            int a = scanner.nextInt();
            if (a < 2) {
                System.out.print("Enter your y: ");
                x = scanner.nextInt();
                System.out.print("Enter your x: ");
                y = scanner.nextInt();
            }

            if (a == 1) {
                Board.bombBoard(array, x, y, xB, yB);
            } else if (a == 2) {
                Board.shotBord(array, x, y, xB, yB);
            } else System.out.println("Try again!");
            Cell.writeCell(array);
            if (array[xB][yB] != 2) System.out.println("Opps! You are miss.");
        }
        System.out.println("You are win!");
    }

}
