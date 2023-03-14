package test;

import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    static boolean isCharNumber(char c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];
        int[] value = new int[3];


        for (int j = 0; j < 3; j++) {
            String s1 = sc.next();
            str[j] = s1;


            int x = sc.nextInt();
            value[j] = x;


        }
        System.out.println("================================");
        for (int j = 0; j < 3; j++) {
            int stringLength = str[j].length();
            System.out.print(str[j]);
            if (stringLength < 15) {
                for (int i = 0; i < 15 - stringLength; i++) {
                    System.out.print(" ");
                }
            }
            if (value[j] < 100 && value[j] >= 10) {
                System.out.printf("0%d%n", value[j]);

            } else if (value[j] < 10) {
                System.out.printf("00%d%n", value[j]);

            } else System.out.printf("%d%n", value[j]);

        }

        System.out.println("================================");
    }
}