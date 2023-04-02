package homework4;

public class Main {

    public static void main(String[] args) {
Pet p = new Pet("Dog", "barsik");
        System.out.println(p);
        Human mother = new Human("Mama", "Lilya", 1990);
        Human father = new Human("Papa", "Bud", 1890);
        Human me = new Human("Micke", "Karleone", 1999, 90,mother,father,p, null);
        System.out.println(me);

    }
}
