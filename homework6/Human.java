package homework6;

public class Human {

    Family family;
    private String name;
    private String surname;
    private int year;
    private int iq; //0...100
    private Dog pet;
    private Human mother;
    private Human father;



    private String[][] schedule;



    public void describePet() {
        System.out.printf("У меня есть [%s], ему [%s] лет, он [%s].", Species.CAT, pet.getAge(), pet.GetTrickLevel()); //информация о питомце
    }

    public int getYear() {
        return year;
    }
    public String getName(){
        return name+" "+surname;
    }
    public String getSurname(){
        return surname;
    }
    public void setFamily(Family family) {
        this.family = family;

    }


    public Human() {

    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int Iq, Human mother, Human father, Dog pet, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%s, iq=%s, mother='%s %s' , father='%s %s' , pet='%s'", name, surname, year, iq, mother.getName(), mother.getSurname(), father.getName(),father.getSurname(), pet);
    }


}
