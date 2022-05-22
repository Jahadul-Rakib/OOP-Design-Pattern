package com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_two.animal_factory.impl;

import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_two.animal_factory.Animal;

public class Dog implements Animal {
    @Override
    public String getAnimalType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Bow Bow......";
    }
}
