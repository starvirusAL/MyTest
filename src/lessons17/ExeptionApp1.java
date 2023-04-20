package lessons17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class ExeptionApp1 {

    static void doWrite(BufferedWriter bw, String s) {
        try {
            bw.write(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(null);

        Stream.of("one", "two", "three").forEach(x -> doWrite(bw, x));
    }
}
