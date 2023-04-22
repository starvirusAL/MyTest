import java.util.HashMap;

public class Human {

    Family family;
    private String name;
    private String surname;
    private int year;
    private int iq; //0...100
    private Pet pet;
    private Human mother;
    private Human father;



    private HashMap<DayOfWeek, String> schedule;

    public void setSchedule(DayOfWeek day, String schedule){
        this.schedule.put(day,schedule);
    }

    public HashMap<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void greetPet() {
        System.out.printf("Привет, [%s]", this.pet.GetNickname());
    }

    public void describePet() {
        System.out.printf("У меня есть [%s], ему [%s] лет, он [%s].", pet.GetSpecies(), pet.GetAge(), pet.GetTrickLevel()); //информация о питомце
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
        this.schedule = new HashMap<DayOfWeek, String>();
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.schedule = new HashMap<DayOfWeek, String>();
        this.name = name;
        this.surname = surname;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Human mother, Human father, Pet pet) {
        this.schedule = new HashMap<DayOfWeek, String>();
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%s, iq=%s, mother='%s %s' , father='%s %s' , pet='%s', schedule: %s", name, surname, year, iq, mother.getName(), mother.getSurname(), father.getName(),father.getSurname(), pet.GetNickname(), schedule);
    }


}
