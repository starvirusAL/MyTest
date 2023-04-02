package homework4;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel; //0 ... 100
    private String[] habits;

    public void eat() {
        System.out.println("Я кушаю!");
    }

    public void respond() {
        System.out.printf("Привет, хозяин. Я - [%s]. Я соскучился!", this.nickname);
    }

    public void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }

    public String GetSpecies() {
        return species;
    }

    public String GetTrickLevel() {
        if (trickLevel > 50) {
            return "очень хитрый";
        } else if (trickLevel <= 50) return "не очень хитрый";
        return "Не известно";
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
