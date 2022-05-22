package com.oop.design_pattern.rakib.creational.abstract_factory_pattern;

import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.all_enum.CarType;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.factory.Car;

public abstract class FactoryInstance {
    public abstract Car getInstance(CarType instanceType);
}
