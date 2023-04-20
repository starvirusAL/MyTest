package lessons15;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Elments {
    public static Map<Character, Long> countLetters(int min, int max) {
        String input = IntStream.rangeClosed(min, max).mapToObj(i -> {
            return String.valueOf(i);
        }).collect(Collectors.joining());

        Map<Character, Long> output = input.codePoints().mapToObj(value -> {
            return (char) value;
        }).collect(Collectors.groupingBy(
                v -> v,
                Collectors.counting()
        ));

        return output;
    }

    public static void main(String[] args) {
        Map<Character, Long> characterIntegerMap = countLetters(173, 215);
        System.out.println(characterIntegerMap);
    }
}
