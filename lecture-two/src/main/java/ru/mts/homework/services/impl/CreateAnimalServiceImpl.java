package ru.mts.homework.services.impl;

import ru.mts.homework.models.Dog;
import ru.mts.homework.repositories.Animal;
import ru.mts.homework.repositories.CreateAnimalService;

import java.util.ArrayList;

public class CreateAnimalServiceImpl implements CreateAnimalService {


    public void createAnimals(int N) {
        if (N < 1)
            return;

        ArrayList<Animal> animals = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            animals.add(new Dog());
            System.out.println("Животное создано (for)" + animals.size());
        }
    }

    @Override
    public void createAnimals() {
        int i = 0;

        ArrayList<Animal> animals = new ArrayList<>();
        do {
            animals.add(new Dog());
            System.out.println("Животное создано (do While)" + animals.size());
            i++;
        } while (i < 10);
    }

    public void createAnimalsDefault() {
        CreateAnimalService.super.createAnimals();
    }

}

