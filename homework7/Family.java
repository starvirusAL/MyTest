import java.util.*;

public class Family {
    private Human mother;
    private Human father;

    private List<Human> children ;

    private Pet pet;


    private int countChild = 0;
    public String getChildName(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Human i : children){
            sb.append(" ");
            sb.append(i.getName());

        }
        sb.append(" ]");
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


    public void addChild(Human child){
        children.add(child);
        countChild++;

    }
    public void deleteChild(Human Child) {

        children.remove(Child);
    }

    public Family(Human mother, Human father) {
        this.children = new ArrayList<Human>();
if(this.pet != null) {
    countChild =countChild+1;
}
        mother.setFamily(this);
        this.mother = mother;
        father.setFamily(this);
        this.father = father;

    }
    public Family(Human mother, Human father, Pet pet) {
        this.children = new ArrayList<Human>();
        this.pet = pet;
        mother.setFamily(this);
        this.mother = mother;
        father.setFamily(this);
        this.father = father;
        if(this.pet != null) {
            countChild =countChild+1;
        }

    }

}







