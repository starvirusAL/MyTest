package test;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What your name?");
        Scanner scaner = new Scanner(System.in);
        String s2 = scaner.nextLine();


        String s1 = "Hello";

        String line2 = String.format("Hello %s!",s2);
        System.out.println(line2);

        System.out.println("How much your leg?");
        Scanner scaner2 = new Scanner(System.in);
        String num = scaner.nextLine ();
        float num2 = Float.parseFloat(num);
        System.out.printf("num of = %s" , num2);

    }
}