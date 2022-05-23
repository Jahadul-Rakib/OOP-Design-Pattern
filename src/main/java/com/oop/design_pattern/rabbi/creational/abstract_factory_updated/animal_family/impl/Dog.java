package com.oop.design_pattern.rabbi.creational.abstract_factory_updated.animal_family.impl;

import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.animal_family.Animal;

public class Dog implements Animal {

    @Override
    public String getType() {
        return "This is Dog!";
    }

    @Override
    public String makeSound() {
        return "Gheu! Gheu!";
    }
}
