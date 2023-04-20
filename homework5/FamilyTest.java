import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FamilyTest {
    Pet cat;

    Human mother = new Human("Elena", "Kostenko", 1953);
    Human father = new Human("Andrey", "Kostenko", 1973);
    Human me = new Human("Alexey", "Kostenko", 1999 );
    Human sister2 = new Human("Dariya", "Kostenko", 1990);
    Human[] children = new Human[2];
    Family first = new Family(father,mother, children);

    Family second = new Family(father,mother);








    @Test
    public void addChild() {
        this.first.addChild(this.sister2);
        Assertions.assertEquals(Arrays.toString(this.first.children), "[Human{name='Dariya', surname='Kostenko', year=1990, null]");
    }

    @Test
    public void deleteChild() {
        this.first.addChild(this.sister2);
        this.first.deleteChild(0);
        Assertions.assertEquals(Arrays.toString(this.first.children), "[null]");
    }

    @Test
    public void deleteChild1() {
        this.first.addChild(this.me);
        this.first.addChild(this.sister2);
       this.first.deleteChild(0);
        Assertions.assertEquals(Arrays.toString(this.first.children), "[Human{name='Dariya', surname='Kostenko', year=1990]");
    }

    @Test
    public void deleteChild2() {
        this.first.addChild(this.sister2);
        this.first.addChild(this.me);
        this.first.deleteChild(1);

        Assertions.assertEquals(Arrays.toString(this.first.children), "[Human{name='Dariya', surname='Kostenko', year=1990]");
    }



    @Test
    public void countFamily() {
        Assertions.assertEquals(this.first.countFamily(), "Family length: 2");
    }

    @Test
    public void testToString() {
        Assertions.assertEquals(this.second.toString(), "Mother: Andrey Kostenko, Father: Elena Kostenko");
    }
}
