package homework9;

public class Pet {

    Family family;
    private String species;
    private String nickname;
    private int age;
    private int trickLevel; //0 ... 100
    private String[] habits;

    public void eat() {
        System.out.println("Я кушаю!");
    }

    public void setFamily(Family family) {
        this.family = family;

    }

    public void respond() {
        System.out.printf("Привет, хозяин. Я - [%s]. Я соскучился!\n", this.nickname);
    }

    public void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }

    public String GetSpecies() {
        return species;
    }

    public String GetTrickLevel() {
        if (trickLevel > 50) {
            return "\nочень хитрый";
        } else if (trickLevel <= 50) return "\nне очень хитрый";
        return "\nНе известно";
    }

    public String[] GetHabits() {
        return habits;
    }

    public int GetAge() {
        return age;
    }

    public String GetNickname() {
        return nickname;
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {

    }

    @Override
    public String toString() {
        return String.format("%s{nickname = '%s', age = '%s', tricklevel = '%s', habits = [%s]}", species, nickname, age, trickLevel, habits);
    }

}
