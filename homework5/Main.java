public class Main {
    public static void main(String[] args) {

        Human mother = new Human("Мария", "Яковлева", 1953);
        Human father = new Human("Иван", "Яковлев", 1973);
        Human me = new Human("Alexey", "Kostenko", 1999 );
        Human sister2 = new Human("Dariya", "Kostenko", 1990);


        Family first = new Family(father,mother);
        System.out.println(first);
        /*for (int i = 0; i < 1000000; i ++) {
            Pet cat = new Pet(Species.CAT, "Layla");
        }*/
    }
}