package lessons13;

public class Pizza {

    private String name;
    private Integer size;

    //    public Pizza() {
//    }
//
    public Pizza(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    // getter
    public String getName() {
        return name;
    }

    // getter
    public Integer getSize() {
        return size;
    }

    // setter
    public void setName(String newName) {
        //..
        //..
        //..
        name = newName;
    }

    // setter
    public void setSize(Integer newSize) {
        //..
        //..
        //..
        size = newSize;
    }

    @Override
    public int hashCode() {
        return size*7 + name.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Pizza: `%s` of size %d", name, size);
    }

    public boolean equals(Object that0) {
        System.out.printf("Running equals for %s\n", this);

        if (that0 == null) return false;
        if (this == that0) return true;

        if (!(that0 instanceof Pizza)) return false;
        Pizza that = (Pizza) that0;

        return this.name.equals(that.name) &&
                this.size.equals(that.size);
    }

    static Pizza validated(String name, Integer size) {
        //
        //
        //
        if (false) {
            throw new RuntimeException("Pizza creation error");
        }
        //
        //
        //
        return new Pizza(name, size);
    }


}
