package test;

import java.util.Scanner;

public class TryCatch {


    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String line1 = scaner.nextLine();
        try{
            int i = Integer.parseInt(line1);
            System.out.printf("input value is %s", i);
        } catch (Exception ex){
            System.out.printf("Exeption is %s", line1);
        }
    }


}
