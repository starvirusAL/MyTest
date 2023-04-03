package homework4;

public class Main {

    public static void main(String[] args) {
        Pet p = new Pet("Dog", "Layma", 7, 51, null);
        Human mother = new Human("Elena", "Kostenko", 1990);
        Human father = new Human("Andriy", "Kostenko", 1890);
        System.out.println(p);
        p.respond();
        p.eat();
        p.foul();
        System.out.println(p.GetTrickLevel());
        Human me = new Human("Alexey", "Kostenko", 1999, 90, mother, father, p, null);
        System.out.println(me);
        Human sister = new Human("Dariya", "Kostenko", 1990, 90, mother, father, p, null);
        Human sister2 = new Human("Dariya", "Kostenko", 1990, 90, mother, father, p, null);
        Family kostenko = new Family(mother, father, p);
        kostenko.addChild(me);

        System.out.println(kostenko);

        System.out.println(kostenko.countFamily());
        kostenko.addChild(sister2);
        System.out.println(kostenko);
        System.out.println(kostenko.countFamily());


    }
}
