package Lessons5;

public class Pizza {
    String name ;
    int size;
    String[] addons;

    Pizza(String name, int size,String[] addons){
        this.name = name;
        this.size =size;
        this.addons = addons;
    }
    Pizza(String name){
        this.name = name;
        this.size = 60;

    }

}



