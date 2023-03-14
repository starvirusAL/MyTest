package test;

import libs.ScanerInput;

public class Solution2 {

    public static void main(String[] args) {
        ScanerInput sc = new ScanerInput();

        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int z = 1;
            for (int j = 0; j <n; ++j) {
                a = a + (z * b);
                z = z + z;
                System.out.printf("%d ", a);
            }
        }
    }

}

