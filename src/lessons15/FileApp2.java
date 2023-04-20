package lessons15;

import java.io.*;

public class FileApp2 {

    public static void main(String[] args) throws IOException {
        String line = "Hello world";
        String filename = "massage.txt";
        File file = new File(filename);
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr, 16384);
        FileWriter fw =  new FileWriter(filename);

        fw.write(line);
        fw.close();
    }
}
