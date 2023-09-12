package com.oop.design_pattern.creational.abstract_factory_pattern.example_two;

import com.oop.design_pattern.creational.abstract_factory_pattern.example_two.animal_factory.AnimalFactory;
import com.oop.design_pattern.creational.abstract_factory_pattern.example_two.color_factory.ColorFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String factoryType) {
        return switch (factoryType) {
            case "Animal" -> new AnimalFactory ();
            case "Color" -> new ColorFactory ();
            default -> null;
        };
    }
}
