package com.oop.design_pattern.rabbi.creational.abstract_factory_updated.factories;

import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.AbstractFactory;
import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.animal_family.Animal;
import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.animal_family.impl.Bear;
import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.animal_family.impl.Dog;
import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.animal_family.impl.Duck;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        } else {
            return new Bear();
        }

    }
}
