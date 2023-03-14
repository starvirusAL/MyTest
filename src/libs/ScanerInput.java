package libs;

import java.util.Scanner;

public class ScanerInput {

    private Scanner scanner = new Scanner(System.in);

    public String nextLine() {
        return scanner.nextLine();
    }
    public int nextInt() {
        return scanner.nextInt();
    }

}
