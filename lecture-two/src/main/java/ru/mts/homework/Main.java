package ru.mts.homework;

import ru.mts.homework.repositories.CreateAnimalService;
import ru.mts.homework.services.impl.CreateAnimalServiceImpl;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl animalService = new CreateAnimalServiceImpl();
        animalService.CreateAnimals();
        animalService.CreateAnimals(10);
        animalService.CreateAnimalsDefault();
    }
}
