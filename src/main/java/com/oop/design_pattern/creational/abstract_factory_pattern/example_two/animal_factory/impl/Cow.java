package com.oop.design_pattern.creational.abstract_factory_pattern.example_two.animal_factory.impl;

import com.oop.design_pattern.creational.abstract_factory_pattern.example_two.animal_factory.Animal;

public class Cow implements Animal {
    @Override
    public String getAnimalType() {
        return "Cow";
    }

    @Override
    public String makeSound() {
        return "Hamba Hamba......";
    }
}
