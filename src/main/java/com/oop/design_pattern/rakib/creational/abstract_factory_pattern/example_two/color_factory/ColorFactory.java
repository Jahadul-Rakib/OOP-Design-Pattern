package com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_two.color_factory;

import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_two.AbstractFactory;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_two.color_factory.impl.Black;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_two.color_factory.impl.Green;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_two.color_factory.impl.White;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String typeOfObject) {
        return switch (typeOfObject) {
            case "White" -> new White ();
            case "Black" -> new Black ();
            case "Green" -> new Green ();
            default -> null;
        };
    }
}
