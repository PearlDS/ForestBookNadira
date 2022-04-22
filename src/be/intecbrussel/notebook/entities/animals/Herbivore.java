package be.intecbrussel.notebook.entities.animals;

import be.intecbrussel.notebook.entities.plants.Plant;

import java.util.HashSet;
import java.util.Set;


public class Herbivore extends Animal {

    private Set<Plant> plantDiet = new HashSet<>();

    public Herbivore(String name) {
        super(name);

    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);

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
        return "Herbivore{" +
                "plantDiet=" + plantDiet +
                "} " + super.toString();
    }
}








