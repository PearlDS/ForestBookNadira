package be.intecbrussel.notebook.app;

import be.intecbrussel.notebook.entities.animals.*;
import be.intecbrussel.notebook.entities.plants.*;
import be.intecbrussel.notebook.service.ForestNoteBook;

import java.util.*;

public class NatureApp {
    public static void main(String[] args) {

        ForestNoteBook noteBook = new ForestNoteBook();

        noteBook.addPlant(new Bush("RaspberryBush", 1.29, "Berry", leafType.ROUND));
        noteBook.addPlant(new Bush("Lemon", 0.95, "Lemon", leafType.SPEAR));
        noteBook.addPlant(new Flower("Rose", 1.20, Scent.SWEET));
        noteBook.addPlant(new Tree("Pine", 3.50, leafType.NEEDLE));
        noteBook.addPlant(new Weed("Nettle", 0.50, 4.0));

        System.out.println("-------------------------------------------------------");

        noteBook.addAnimal(new Herbivore("Horse", 75, 140, 200));
        noteBook.addAnimal(new Herbivore("Olifant", 900, 600, 450));
        noteBook.addAnimal(new Herbivore("Beaver", 2, 20, 25));
        noteBook.addAnimal(new Omnivore("Squirrel", 4, 12, 20, 3));
        noteBook.addAnimal(new Omnivore("Bear", 95, 65, 159, 5));
        noteBook.addAnimal(new Omnivore("Hedgehog", 2.5, 17, 33, 1.5));
        noteBook.addAnimal(new Carnivore("Wolf", 45, 65, 70, 4));
        noteBook.addAnimal(new Carnivore("Lion", 55, 60, 66, 6));
        noteBook.addAnimal(new Carnivore("Racoon", 3.5, 25, 20, 2));


        noteBook.addAnimal(new Animal("Rabbit"));
        noteBook.addAnimal(new Animal("Cat"));
        noteBook.addAnimal(new Animal("Snake"));
        noteBook.addAnimal(new Animal("Fish"));
        noteBook.addAnimal(new Animal("Fox"));


        noteBook.printNotebook();
        System.out.println("---------------------------------------------------");


        System.out.println("amountOfPlants: " + noteBook.getPlantCount());
        System.out.println("amountOfAnimals " + noteBook.getAnimalCount());
        System.out.println("----------------------------------------------------");

        noteBook.sortAnimalsByName();
        noteBook.sortPlantsByName();


    }

}
