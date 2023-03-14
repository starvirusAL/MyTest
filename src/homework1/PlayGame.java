package homework1;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class PlayGame {
    public static int RandomNum(int minV, int maxV) {
        Double randomNum = Math.random();
        int range = maxV - minV + 1;
        int result = (int) (randomNum * range + minV);
        return result;
    }


    public static void main(String[] args) {
        System.out.printf("What is your name? %n");
        Scanner scannerName = new Scanner(System.in);
        String name = scannerName.nextLine();
        System.out.printf("Hello, %s! ", name);
        System.out.printf("Let the game begin! %n");


        int randomGameNum = RandomNum(0, 100);
        int[] numOfArray = new int[100];
        for (int i = 0; i >= 0; i++) {
            Scanner scanerUserNum = new Scanner(System.in);
            String userNum = scanerUserNum.nextLine(); // считывание числа пользователя
            try {
                int parseUserNum = Integer.parseInt(userNum);

                numOfArray[i] = parseUserNum; // запись числа пользователя

                if (randomGameNum > parseUserNum) {
                    System.out.println("Your number is too small. Please, try again.");
                } else if (randomGameNum < parseUserNum) {
                    System.out.println("Your number is too big. Please, try again");
                } else if (randomGameNum == parseUserNum) {
                    System.out.printf("Congratulations, %s!, It is number - %s %nYour number(s): %n", name, randomGameNum);

                    Arrays.sort(numOfArray);
                    for (int j = numOfArray.length - 1; j > 0; j--) {
                        if (numOfArray[j] == 0) {
                            continue;
                        }
                        System.out.print(numOfArray[j] + " ");
                    }
                    break;
                }

            } catch (Exception ex) {
                System.out.printf("Incorect num! Try again!");
            }
        }
    }
}


