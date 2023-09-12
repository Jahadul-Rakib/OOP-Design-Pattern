package com.oop.design_pattern.creational.abstract_factory_pattern.example_two.animal_factory;

import com.oop.design_pattern.creational.abstract_factory_pattern.example_two.AbstractFactory;
import com.oop.design_pattern.creational.abstract_factory_pattern.example_two.animal_factory.impl.Cat;
import com.oop.design_pattern.creational.abstract_factory_pattern.example_two.animal_factory.impl.Cow;
import com.oop.design_pattern.creational.abstract_factory_pattern.example_two.animal_factory.impl.Dog;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String typeOfObject) {
        return switch (typeOfObject) {
            case "Cat" -> new Cat();
            case "Cow" -> new Cow();
            case "Dog" -> new Dog();
            default -> null;
        };
    }
}
