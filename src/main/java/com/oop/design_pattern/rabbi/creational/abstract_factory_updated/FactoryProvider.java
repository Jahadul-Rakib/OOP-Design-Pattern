package com.oop.design_pattern.rabbi.creational.abstract_factory_updated;

import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.factories.AnimalFactory;
import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.factories.ColorFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){

        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }

        return null;
    }
}
