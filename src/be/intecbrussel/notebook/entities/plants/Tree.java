package be.intecbrussel.notebook.entities.plants;

public class Tree extends Plant{
    private leafType LeafType;

    public Tree(String name, leafType leafType) {
        super(name);
        LeafType = leafType;
    }

    public Tree(String name, double height, leafType leafType) {
        super(name, height);
        LeafType = leafType;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "LeafType=" + LeafType +
                "} " + super.toString();
    }
}
