package com.oop.design_pattern.creational.abstract_factory_pattern.example_one;

import com.oop.design_pattern.creational.abstract_factory_pattern.example_one.factory.bus_fectory.BusFactory;
import com.oop.design_pattern.creational.abstract_factory_pattern.example_one.all_enum.FactoryType;
import com.oop.design_pattern.creational.abstract_factory_pattern.example_one.factory.truck_factory.TruckFactory;

public class FactoryProducer {
    public static FactoryInstance getFactory(FactoryType carType) {
        return switch (carType) {
            case BUS -> new BusFactory();
            case TRUCK -> new TruckFactory ();
            default -> null;
        };
    }
}
