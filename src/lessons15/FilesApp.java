package lessons15;

import java.io.*;

public class FilesApp {
    public static void main(String[] args) throws IOException {
        String line = "Hello world";
        String path = "C:\\NewJava\\";
        String filename = "massage";
        String fileSrc = ".txt";


        for (int i = 0; i < 100; i++) {
            String.valueOf(i);
            String namePath = filename + String.valueOf(i);
            File file = new File(path+namePath+fileSrc);

            FileWriter fw =  new FileWriter(file);
            fw.write(line);
            fw.close();
        }
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr, 16384);
        while (true){

        }
    }
}
