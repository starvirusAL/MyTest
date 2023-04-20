package lessons17;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaExample1 {
    public static void main(String[] args) {
        Stream.of(1,2,3).forEach(new Consumer<Integer>(){
            @Override
            public  void accept(Integer x){
                System.out.println(x);
            }
        });
        Stream.of(1,2,4).forEach(x ->System.out.println(x));
    }
}
