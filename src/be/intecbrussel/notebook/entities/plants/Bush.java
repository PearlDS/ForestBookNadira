package be.intecbrussel.notebook.entities.plants;

public class Bush extends Plant{

    private String fruit;
    private leafType LeafType;


    public Bush(String name, String fruit) {
        super(name);
        this.fruit = fruit;
    }

    public Bush(String name, double height, String fruit, leafType leafType) {
        super(name, height);
        this.fruit = fruit;
        LeafType = leafType;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public leafType getLeafType() {
        return LeafType;
    }

    public void setLeafType(leafType leafType) {
        LeafType = leafType;
    }

    @Override
    public String toString() {
        return "Bush{" +
                "fruit='" + fruit + '\'' +
                ", LeafType=" + LeafType +
                "} " + super.toString();
    }
}
