package ru.mts.homework;

import ru.mts.homework.services.impl.CreateAnimalServiceImpl;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl animalService = new CreateAnimalServiceImpl();
        animalService.createAnimals();
        animalService.createAnimals(10);
        animalService.createAnimalsDefault();
    }
}
