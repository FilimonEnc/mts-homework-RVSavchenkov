package ru.mts.homework.models;

import ru.mts.homework.models.impls.AbstractAnimal;

public class Pet extends AbstractAnimal {
    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }
}
