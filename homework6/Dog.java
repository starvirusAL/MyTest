package homework6;

public class Dog extends Pet {
    public Dog(String nickname, int age){
this.nickname = nickname;
this.age = age;
    }

    @Override
    public void respond() {

            System.out.printf("Привет, хозяин. Я - [%s]. Я соскучился!\n", this.nickname);

    }
}
