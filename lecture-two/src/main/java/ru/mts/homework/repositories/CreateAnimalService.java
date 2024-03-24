package ru.mts.homework.repositories;

import ru.mts.homework.models.Dog;

import java.util.ArrayList;

public interface CreateAnimalService {
    default void CreateAnimals() {
        int i = 0;
        ArrayList<Animal> animals = new ArrayList<Animal>();
        while (i < 10) {
            animals.add(new Dog());
            System.out.println("Животное создано (while)");
            i++;
        }
    }

}
