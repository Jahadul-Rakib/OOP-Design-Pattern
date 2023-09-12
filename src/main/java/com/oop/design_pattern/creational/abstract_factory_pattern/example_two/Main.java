package com.oop.design_pattern.creational.abstract_factory_pattern.example_two;

import com.oop.design_pattern.creational.abstract_factory_pattern.example_two.animal_factory.Animal;

public class Main {
    public static void main(String[] args) {
        AbstractFactory animalFactory = FactoryProvider.getFactory ("Animal");
        Animal cat = (Animal) animalFactory.create ("Cat");
        System.out.println (cat.getAnimalType ());
        System.out.println (cat.makeSound ());
    }
}
