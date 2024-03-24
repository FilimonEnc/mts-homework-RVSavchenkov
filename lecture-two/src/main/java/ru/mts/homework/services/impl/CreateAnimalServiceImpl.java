package ru.mts.homework.services.impl;

import ru.mts.homework.models.Dog;
import ru.mts.homework.repositories.Animal;
import ru.mts.homework.repositories.CreateAnimalService;

import java.util.ArrayList;

public class CreateAnimalServiceImpl implements CreateAnimalService {

    public void CreateAnimals(int N) {
        if (N < 1)
            return;

        ArrayList<Animal> animals = new ArrayList<Animal>();

        for (int i = 0; i < N; i++) {
            animals.add(new Dog());
            System.out.println("Животное создано (for)");
        }
    }

    @Override
    public void CreateAnimals() {
        int i = 0;

        ArrayList<Animal> animals = new ArrayList<Animal>();
        do {
            animals.add(new Dog());
            System.out.println("Животное создано (do While)");
            i++;
        } while (i < 10);
    }

    public void CreateAnimalsDefault() {
        CreateAnimalService.super.CreateAnimals();
    }
}

