package homework3;

import libs.OutputArray;

import java.util.Locale;
import java.util.Scanner;

public class Calendar {

    String massage = "Your tasks for Monday:";

    public static void Massage(String day, String chalenge) {
        System.out.printf("Your tasks for %s: %s%n", day, chalenge);
    }

    public static void main(String[] args) {
        String[][] calendar = new String[7][2];
        calendar[0][0] = "Monday";
        calendar[1][0] = "Tuesday";
        calendar[2][0] = "Wednesday ";
        calendar[3][0] = "Thursday";
        calendar[4][0] = "Friday ";
        calendar[5][0] = "Saturday ";
        calendar[6][0] = "Sunday ";

        calendar[0][1] = "go to courses; watch a film.";
        calendar[1][1] = "do home work1";
        calendar[2][1] = "go to courses;";
        calendar[3][1] = "do home work";
        calendar[4][1] = "watch a film.";
        calendar[5][1] = "by by";
        calendar[6][1] = "do home work";


        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("Please, input the day of the week:");

            String day = scanner.nextLine().toLowerCase(Locale.ROOT).trim();

            switch (day) {
                case  "change monday":
                    System.out.printf("change task for monday%n");
                    calendar[0][1] = scanner.nextLine().toLowerCase(Locale.ROOT).trim();
                case "monday":
                    Massage(calendar[0][0], calendar[0][1]);
                    break;
                case  "change tuesday":
                    System.out.printf("change task for tuesday%n");
                    calendar[1][1] = scanner.nextLine().toLowerCase(Locale.ROOT).trim();
                case "tuesday":

                    Massage(calendar[1][0], calendar[1][1]);
                    break;
                case  "change wednesday":
                    System.out.printf("change task for wednesday%n");
                    calendar[2][1] = scanner.nextLine().toLowerCase(Locale.ROOT).trim();
                case "wednesday":
                    Massage(calendar[2][0], calendar[2][1]);
                    break;
                case  "change thursday":
                    System.out.printf("change task for thursday%n");
                    calendar[3][1] = scanner.nextLine().toLowerCase(Locale.ROOT).trim();
                case "thursday":
                    Massage(calendar[3][0], calendar[3][1]);
                    break;
                case  "change friday":
                    System.out.printf("change task for friday%n");
                    calendar[4][1] = scanner.nextLine().toLowerCase(Locale.ROOT).trim();
                case "friday":
                    Massage(calendar[4][0], calendar[4][1]);
                    break;
                case  "change saturday":
                    System.out.printf("change task for saturday%n");
                    calendar[5][1] = scanner.nextLine().toLowerCase(Locale.ROOT).trim();
                case "saturday":
                    Massage(calendar[5][0], calendar[5][1]);
                    break;
                case  "change sunday":
                    System.out.printf("change task for sunday%n");
                    calendar[6][1] = scanner.nextLine().toLowerCase(Locale.ROOT).trim();
                case "sunday":
                    Massage(calendar[6][0], calendar[6][1]);
                    break;
                case "exit":
                    isTrue = false;
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;
            }

        }
    }
}
