package be.intecbrussel.notebook.entities.animals;

import be.intecbrussel.notebook.entities.plants.Plant;

import java.util.HashSet;
import java.util.Set;


public class Omnivore extends Animal {

    private double maxFoodSize;
    private Set<Plant> plantDiet = new HashSet<>();

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length, double maxFoodSize) {
        super(name, weight, height, length);
        this.maxFoodSize = maxFoodSize;

    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "Omnivore{" +
                "maxFoodSize=" + maxFoodSize +
                ", plantDiet=" + plantDiet +
                "} " + super.toString();
    }
}


