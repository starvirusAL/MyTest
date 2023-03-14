package test;

import java.util.*;
import java.io.*;
import  java.util.Scanner;

public class Solution3 {
    public static boolean isByte(String s) {

        try {
            Byte.parseByte(s);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static boolean isShort(String s) {

        try {
            Short.parseShort(s);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static boolean isInt(String s) {

        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static boolean isLong(String s) {

        try {
            Long.parseLong(s);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }


    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();

        for (int i = 0; i < Integer.parseInt(t); i++) {
            String x = sc.nextLine();
            System.out.println(x + " can be fitted in:");

            if (isByte(x))
                System.out.println("* byte");
            if (isShort(x))
                System.out.println("* short");
            if (isInt(x))
                System.out.println("* int");
            if (isLong(x))
                System.out.println("* long");
            else System.out.println(sc.next() + " can't be fitted anywhere.");


            //Complete the code


        }
    }
}
