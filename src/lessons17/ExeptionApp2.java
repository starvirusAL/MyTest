package lessons17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static jdk.jfr.consumer.EventStream.openFile;

public class ExeptionApp2 {

    static void openFile1(){
        try {

            FileOutputStream fs = new FileOutputStream("1.txt");
        }catch (FileNotFoundException ex){
            //....
        }

    }
    static void openFile() throws FileNotFoundException{

            FileOutputStream fs = new FileOutputStream("1.txt");

    }
    static  String doSomething() throws FileNotFoundException {
        openFile();
        return "OK";
    }
    public static void main(String[] args) throws FileNotFoundException {
        String massage = doSomething();
        System.out.println(massage);
    }
}
