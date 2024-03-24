package ru.mts.homework.models.impls;

import ru.mts.homework.repositories.Animal;

public class AbstractAnimal implements Animal {

    protected String breed; // порода
    protected String name; // имя
    protected Double cost; // цена в магазине
    protected String character; // характер

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
