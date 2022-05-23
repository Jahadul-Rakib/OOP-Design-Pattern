package com.oop.design_pattern.rabbi.creational.abstract_factory_updated.factories;

import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.AbstractFactory;
import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.color_family.Color;
import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.color_family.impl.Black;
import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.color_family.impl.Brown;
import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.color_family.impl.White;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String colorType) {
        if ("White".equalsIgnoreCase(colorType)) {
            return new White();
        } else if ("Brown".equalsIgnoreCase(colorType)) {
            return new Brown();
        } else {
            return new Black();
        }
    }
}
