package homework6;

import java.security.PublicKey;

public final class  Woman {

    Pet pet = new Pet() ;
    public void greetPet() {
        System.out.printf("Какой же ты у меня милый, [%s]", pet.getNickname());
    }

    public void makeup(){
        System.out.println("makeup");
    }
}
