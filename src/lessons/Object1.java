package lessons;

public class Object1 {

    public  static void doSomthing(Pizza pizza){
        return;
    };

    public static void main(String[] args) {
        Pizza p = new Pizza("Margaritha", 60, new  String[]{"pepper"});
        Pizza p1 = new Pizza("Carbonara");
        p.name  = "Margaritha21";
        p.size = 602;
        p.addons = new  String[]{"pepper"};
        System.out.println(p1.size);

        doSomthing(p);

    }
}
