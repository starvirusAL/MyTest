package test;

import static libs.Ex.NI;

public class testArrayChild {
    private int count;

    private int[] data;

    public testArrayChild() {
        data = new int[4];
        count = 0;
    }

    private void grow() {
        int[] data2 = new int[(int) (data.length * 1.5 + 1)];
        System.arraycopy(data, 0, data2, 0, data.length);
        data = data2;
    }

    private void ensureSizeEnough() {
        if (count >= data.length) grow();
    }

    public void addChild(int number) {
        ensureSizeEnough();
        data[count] = number;
        count++;

    }

    public void deleteChild(int idChild) {
        if (idChild > count) System.out.println("don't have enough child");
        if (idChild > count) System.out.println("index must be positive");
        System.arraycopy(data, idChild + 1, data, idChild, data.length - idChild - 1);
        count--;
    }

    public String countFamily(int[] idChild) {
        return String.format("Family length: %s", count+2) ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < count; i++) {
            if (i > 0) sb.append(", ");
            sb.append(data[i]);


        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        testArrayChild arrayChild = new testArrayChild();
        arrayChild.addChild(1);
        arrayChild.addChild(1);
        arrayChild.addChild(1);
        arrayChild.deleteChild(2);
        arrayChild.addChild(1);
        arrayChild.addChild(1);
        arrayChild.addChild(1);
        arrayChild.deleteChild(2);arrayChild.addChild(1);
        arrayChild.addChild(1);
        arrayChild.addChild(1);
        arrayChild.deleteChild(2);
        System.out.println(arrayChild);


    }

}
