package lessons14;

import lessons12.Counter;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static libs.Ex.NI;

public class RansomNote {

    public static Map<String, Integer> toMap(List<String> words) {
        Counter<String> c = new Counter<>();
        for (String w : words) {
            c.count(w);
        }
        words.forEach(w -> c.count(w));
        return c.get();

    }

    public static Map<String, Long> toMap1(List<String> words) {
        return words.stream()
                .collect(groupingBy(w ->w, counting()));

    }

    public static boolean checkMagazine(List<String> magazine, List<String> note) {
        Map<String, Integer> mapMagazine = toMap(magazine);
        Map<String, Integer> mapNote = toMap(note);

        Set<String> wordsNote = mapNote.keySet();

        for (String word : wordsNote) {
            int noteCount = mapNote.get(word);
            int magazineCount = mapMagazine.getOrDefault(word, 0);
            if (noteCount < magazineCount) return false;

        }


        return true;
    }


}
