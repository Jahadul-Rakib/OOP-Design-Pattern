package com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one;

import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one.all_enum.CarType;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one.factory.Car;

public abstract class FactoryInstance {
    public abstract Car getInstance(CarType instanceType);
}
