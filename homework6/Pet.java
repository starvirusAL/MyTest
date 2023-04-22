package homework6;

public abstract class   Pet  {

    Family family;

    protected String nickname;
    protected int age;
    protected int trickLevel; //0 ... 100
    protected String[] habits;

    public void eat() {
        System.out.println("Я кушаю!");
    }

    public void setFamily(Family family) {
        this.family = family;

    }

    public abstract void  respond();



public Pet(){

}

    public String GetTrickLevel() {
        if (trickLevel > 50) {
            return "\nочень хитрый";
        } else if (trickLevel <= 50) return "\nне очень хитрый";
        return "\nНе известно";
    }

    public String[] getHabits() {
        return habits;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }



    @Override
    public String toString() {
        return String.format("%s{nickname = '%s', age = '%s', tricklevel = '%s', habits = [%s]}",  nickname, age, trickLevel, habits);
    }

}
