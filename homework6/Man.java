package homework6;

public final class Man {

    Pet pet = new Pet() ;
    public void greetPet() {
        System.out.printf("Привет, [%s]", pet.getNickname());
    }

    public void repairCar(){
        System.out.println("repairCar");
    }
}

