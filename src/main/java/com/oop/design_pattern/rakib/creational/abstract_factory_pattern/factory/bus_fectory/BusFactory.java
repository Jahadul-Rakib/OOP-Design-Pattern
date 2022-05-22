package com.oop.design_pattern.rakib.creational.abstract_factory_pattern.factory.bus_fectory;

import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.factory.Car;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.all_enum.CarType;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.FactoryInstance;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.factory.bus_fectory.buses.FiftySitBus;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.factory.bus_fectory.buses.SeventySitBus;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.factory.bus_fectory.buses.SixtySitBus;

public class BusFactory extends FactoryInstance {
    @Override
    public Car getInstance(CarType instanceType) {
        return switch (instanceType) {
            case BUS_50 -> new FiftySitBus ();
            case BUS_60 -> new SixtySitBus ();
            case BUS_70 -> new SeventySitBus ();
            default -> null;
        };
    }
}
