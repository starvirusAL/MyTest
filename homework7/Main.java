public class Main {

    public static void main(String[] args) {

        Pet p = new Pet("Dog", "Layma", 7, 51);
        p.setHabits("Guv");
        p.setHabits("myau");
        System.out.println(p);
        System.out.println("==================");

        Human mother = new Human("Elena", "Kostenko", 1990);


        Human father = new Human("Andriy", "Kostenko", 1890);
        Human me = new Human("Alexey", "Kostenko", 1999, 90, mother, father, p);
        me.setSchedule(DayOfWeek.MONDAY, "Karate");
        System.out.println(me);
        System.out.println("==================");
        Human sister = new Human("Dariya", "Kostenko", 1990, 90, mother, father, p);
        Family kostenko = new Family(mother, father, p);

        kostenko.addChild(me);
        kostenko.addChild(sister);
        System.out.println(kostenko);
        System.out.println(kostenko.countFamily());




    }
}
