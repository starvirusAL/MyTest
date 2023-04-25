package homework9;

import java.time.LocalDate;

public class Human {

    Family family;
    private String name;
    private String surname;
    public LocalDate birthDay;
    int ageYear = 0;
    int ageMonth = 0;
    int ageDay = 0;
    private LocalDate age;
    private int iq; //0...100
    private Pet pet;
    private Human mother;
    private Human father;

    public String describeAge() {
        LocalDate now = LocalDate.now();
        this.birthDay = birthDay.of(this.ageYear, this.ageMonth, this.ageDay);


        if (now.getYear() >= this.ageYear) {
            ageYear = now.getYear() - this.ageYear;

            if (now.getMonthValue() > this.ageMonth) {
                ageMonth = now.getMonthValue() - this.ageMonth;
            } else if (now.getMonthValue() < this.ageMonth) {
                ageYear = ageYear - 1;
                ageMonth = 12 + (now.getMonthValue() - this.ageMonth);
            } else if (now.getMonthValue() == this.ageMonth) {
                ageMonth = 0;
            }

            if (now.getDayOfMonth() > this.ageDay) {
                ageDay = now.getDayOfMonth() - this.ageDay;
            } else if (now.getDayOfMonth() < this.ageDay) {
                ageMonth = ageMonth - 1;
                ageDay = 30 + (now.getDayOfMonth() - this.ageDay);
            }
        } else {
            System.out.println("Пожалуйста, введите все значения правильно.");
        }



       /* if (ageYear < 0 || ageMonth < 0 || ageDay < 0){
            return String.format("Пожалуйста, введите все значения правильно.");*/
        return String.format("%s лет, %s месяц(в), %s  дня(й)", ageYear, ageMonth, ageDay);
    }

    public String setBirthDay(int ageYear, int ageMonth, int ageDay) {
        this.ageYear = ageYear;
        this.ageMonth = ageMonth;
        this.ageDay = ageDay;
        return String.format("%s лет, %s месяц(в), %s  дня(й)", ageYear, ageMonth, ageDay);

    }

    private String[][] schedule;

    public void greetPet() {
        System.out.printf("Привет, [%s]", this.pet.GetNickname());
    }

    public void describePet() {
        System.out.printf("У меня есть [%s], ему [%s] лет, он [%s].", pet.GetSpecies(), pet.GetAge(), pet.GetTrickLevel()); //информация о питомце
    }


    public String getName() {
        return name + " " + surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setFamily(Family family) {
        this.family = family;

    }


    public Human(String alexey, String kostenko, int year, int month, int day) {
this.name =alexey;
this.surname = kostenko;
setBirthDay(year,month,day);

    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;

    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, LocalDate birthDay, int Iq, Human mother, Human father, Pet pet, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        if (mother == null && father == null)
            return String.format("Human{name='%s', surname='%s', age= %s", name, surname, describeAge());
        else
            return String.format("Human{name='%s', surname='%s', year=%s, iq=%s, mother='%s %s' , father='%s %s' , pet='%s'", name, surname, describeAge(), iq, mother.getName(), mother.getSurname(), father.getName(), father.getSurname(), pet);
    }


}
