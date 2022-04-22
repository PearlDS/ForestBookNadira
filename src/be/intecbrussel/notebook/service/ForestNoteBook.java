package be.intecbrussel.notebook.service;

import be.intecbrussel.notebook.entities.animals.*;
import be.intecbrussel.notebook.entities.plants.*;

import java.util.*;

public class ForestNoteBook {

    private static int plantCount;
    private static int animalCount;
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();


    public ForestNoteBook() {
    }

    {
        plantCount++;
    }

    {
        animalCount++;
    }


    public static void setPlantCount(int plantCount) {

        ForestNoteBook.plantCount = plantCount;
    }

    public static int getPlantCount() {
        return plantCount;
    }

    public static void setAnimalCount(int animalCount) {
        ForestNoteBook.animalCount = animalCount;
    }

    public static int getAnimalCount() {
        return animalCount;
    }


    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);

    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void printNotebook() {
        for (Plant p : plants) {
            System.out.println(p);
        }
        System.out.println("---------------------------------------------------------------------");
        for (Animal a : animals) {
            System.out.println(a);
        }
    }

    public void sortAnimalsByName() {
        animals.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    public void sortPlantsByName() {
        plants.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    }




}





