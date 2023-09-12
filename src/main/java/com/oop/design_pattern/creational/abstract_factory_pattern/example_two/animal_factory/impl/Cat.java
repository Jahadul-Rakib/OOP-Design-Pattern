package com.oop.design_pattern.creational.abstract_factory_pattern.example_two.animal_factory.impl;

import com.oop.design_pattern.creational.abstract_factory_pattern.example_two.animal_factory.Animal;

public class Cat implements Animal {
    @Override
    public String getAnimalType() {
        return "Cat";
    }

    @Override
    public String makeSound() {
        return "Meow Meow......";
    }
}
