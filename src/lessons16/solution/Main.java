package lessons16.solution;

import java.util.ArrayList;
import java.util.List;

public class Main {

    record   Sentence  (String subject, String verb, String object){

        @Override
        public String toString(){
            return String.format("%s %s %s", subject,verb,object);
        }

    }



       static List<Sentence> combiation(List<String> subject,List<String> verbs,List<String> object){
             ArrayList<Sentence> outcome = new ArrayList<>();
            for (String subj: subject)
                for (String verb: verbs)
                    for (String obj: object)
                        outcome.add(new Sentence(subj,verb,obj));
        return outcome;
    }

    public static void main(String[] args) {
        List<String> subject = List.of("Noel", "Cat", "Dog");
        List<String> verbs = List.of("wrote", "Chased", "slept on");
        List<String> objects = List.of("the book", "the ball", "the bed");
        combiation(subject,verbs,objects).forEach(System.out::println);
    }
}
