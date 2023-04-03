package homework4;

public class Family {
    private Human mother;
    private Human father;

    private Human[] children;

    private Pet pet;


    private int countChild = 0;
    public String getChildName(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < countChild; i++) {
            if (i > 0) sb.append(", ");
            sb.append(children[i].getName());
        }
        sb.append("]");
        return sb.toString();
    }
    @Override
public String toString(){
        if (pet == null) return String.format("Mother: %s, Father: %s, Child: %s", mother.getName(),father.getName(), getChildName());
        return String.format("Mother: %s, Father: %s, Child: %s pet: %s", mother.getName(),father.getName(), getChildName(), pet.GetNickname());
    }
    public String countFamily() {
        return String.format("Family length: %s", countChild+2) ;
    }

    private void grow() {
        Human [] data2 = new Human[(int) (children.length * 1.5 + 1)];
        System.arraycopy(children, 0, data2, 0, children.length);
        children = data2;
    }

    private void ensureSizeEnough() {
        if (countChild >= children.length) grow();
    }

    public void addChild(Human child) {
        ensureSizeEnough();
        children[countChild] = child;
        countChild++;

    }
    public void deleteChild(int idChild) {
        if (idChild > countChild) System.out.println("don't have enough child");
        if (idChild > countChild) System.out.println("index must be positive");
        System.arraycopy(children, idChild + 1, children, idChild, children.length - idChild - 1);
        countChild--;
    }

    public Family(Human mother, Human father) {
        this.children = new Human[2];
        this.pet = pet;
        mother.setFamily(this);
        this.mother = mother;
        father.setFamily(this);
        this.father = father;

    }
    public Family(Human mother, Human father, Pet pet) {
        this.children = new Human[2];
        this.pet = pet;
        mother.setFamily(this);
        this.mother = mother;
        father.setFamily(this);
        this.father = father;

    }

}







