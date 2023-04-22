package homework6;

public class RoboCat extends Pet {
    public RoboCat(String nickname, int age){
        this.nickname = nickname;
        this.age = age;
    }

    @Override
    public void respond() {
        System.out.printf("Привет, хозяин. Я - [%s]. Я соскучился!\n", this.nickname);
    }
}
