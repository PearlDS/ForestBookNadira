package be.intecbrussel.notebook.entities.animals;

public class Carnivore extends Animal{
    private double maxFoodSize;

    public Carnivore(String name, double weight, double height, double length, double maxFoodSize) {
        super(name, weight, height, length);
        this.maxFoodSize = maxFoodSize;
    }

    public Carnivore(String name, double maxFoodSize) {
        super(name);
        this.maxFoodSize = maxFoodSize;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "maxFoodSize=" + maxFoodSize +
                "} " + super.toString();
    }
}
