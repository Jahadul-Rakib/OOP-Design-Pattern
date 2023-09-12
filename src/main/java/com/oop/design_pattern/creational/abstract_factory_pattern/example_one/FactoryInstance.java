package com.oop.design_pattern.creational.abstract_factory_pattern.example_one;

import com.oop.design_pattern.creational.abstract_factory_pattern.example_one.factory.Car;
import com.oop.design_pattern.creational.abstract_factory_pattern.example_one.all_enum.CarType;

public abstract class FactoryInstance {
    public abstract Car getInstance(CarType instanceType);
}
