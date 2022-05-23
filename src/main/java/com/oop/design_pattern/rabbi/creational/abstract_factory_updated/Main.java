package com.oop.design_pattern.rabbi.creational.abstract_factory_updated;

import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.factories.AnimalFactory;
import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.factories.ColorFactory;

public class Main {
    public static void main(String[] args) {
        FactoryProvider fp = new FactoryProvider();
        AnimalFactory anmlf = (AnimalFactory) fp.getFactory("Animal");
        ColorFactory clrf = (ColorFactory) fp.getFactory("Color");
        System.out.printf(anmlf.create("Dog").getType());
        System.out.printf(clrf.create("White").getColor());
    }
}
